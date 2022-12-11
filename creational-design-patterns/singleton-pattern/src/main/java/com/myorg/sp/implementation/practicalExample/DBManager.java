package com.myorg.sp.implementation.practicalExample;

/**
 * Singleton Design Pattern:
 * -------------------------
 *
 *      This example consists of the best practise for Singleton called "Double-Checked Locking". Also, this is
 *      Singleton lazy initialization approach.
 *
 *      Singleton means one instance. Actually it's one instance per container/ one instance per JVM.
 *
 *      If it's required to take more arguments when initializing, it's better to go for Factory pattern rather than
 *      using Singleton.
 *
 *      Singleton pattern should not be overkilled because it's hard to do unit testing for Singleton. Because there
 *      are no instance variables and any other references to create.
 *
 *      We only need to use singleton only where it is required.
 *
 *      Overusing of singleton pattern is not recommended
 *
 * Resources:
 * ----------
 *      https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */

public class DBManager {
    /** volatile keyword here makes sure that the changes made in one thread are immediately reflect in other threads*/
    private static volatile DBManager dbManager; // By default, the dbManager value is null

    /**
     * We make the constructor private so no one will be able to create a second instance by invoking the constructor
     */
    private DBManager() {

        /**
         * Reason for this addition of code is that Reflections may interfere with this and create a second instance
         * by manually invoking the constructor. So we can stop/block it with this piece of code here.
         * */
        if (dbManager != null) {
            throw new RuntimeException("Please use getDBManager method");
        }
    }// End of constructor


    /**
     ======================================================================
     * Important facts to consider when implementing getInstance() method !
     ======================================================================

     * There can be edge cases where two or more threads create more than one instance in traditional implementation
     * Example Scenario:

         > Code :

             public static DBManager getInstance() {
                 if (dbManager == null) {
                    dbManager = new DBManager();
                 }
                return dbManager;
             }

         > Pre condition :

             - dbManager is null and has not been instantiated yet.
             - There are two threads called "Thread-1" and "Thread-2" by which the above code is being executed
               simultaneously

         > Execution :

             - Thread-1 executes  "if (dbManager == null)" line and proceeds inside if block and executes
               "dbManager = new DBManager();"

             - While "dbManager" is being instantiated by "Thread-1", there's chance that "Thread-2" executes the
               line "if (dbManager == null)", and that condition can also become true due to "Thread-1" has not
               completed "dbManager" instantiation yet and is still in progress.

             - In that case "Thread-2" can also go inside if block and invoke "dbManager = new DBManager();" to
               create another instance.

             - This happens due to above code is not thread safe.

     * To avoid that what we can do is using "Double-Checked Locking" thread safe approach (implemented below)
     */
    public static DBManager getInstance() {

        /** if the "dbManager" is already instantiated then this method immediately returns "dbManager". There it's not
         * required to worry about multiple threads executing this as the outcome is the same for each thread */
        if (dbManager == null) {

            /** Acquires class level lock and makes this particular block thread safe. Which means this block is tread-safe
             * and only one thread is allowed to execute it at a time */
            synchronized (DBManager.class) {

                /** (Assume "Thread-1" has already passed below null check and executing "dbManager = new DBManager();"
                     inside if block).

                 * This second null check will avoid creating another instance of "dbManager" by some other thread
                   (let's say "Thread-2") which is waiting to acquire class level lock to access synchronized block
                   after "Thread-1" releases it.

                 * There, "Thread-"2 will have to wait for "Thread-1" to instantiate "dbManager" and release class level
                   lock. Once "Thread-1" is done , then only "Thread-2" will access synchronized block and it'll not
                   instantiate another instance of "dbManager" as this null check definitely return false by then.
                 */
                if (dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }
}
