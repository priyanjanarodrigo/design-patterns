/*
 *
 * Following is the Singleton lazy thread safe best practise. This approach
 * is called "Double Ckecked Locking"
 * 
*/
class SingletonLazyThreadSafeDCL {
    public static SingletonLazyThreadSafeDCL singletonLazyThreadSafeDCL_Instance = null;

    private String message = "SingletonLazyThreadSafe_DCL";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    /*
     *
     * After an object is crated, there is no need to use synchronization as created
     * object will not be null and any execution sequence will not acquire class
     * level lock but will return the created/ already existing object.
     * 
     * So it is only once that the class level has to be acquired on getInstance()
     * method (only when the singletonLazyThreadSafeDCL_Instance object is null).
     * 
     * This approach will synchronize the object creation only once and rest of the
     * execution sequences will not have to wait or acquire the lock.
     * This/zynchronization is occured only on the first time that the method is
     * executed.
     * 
    */
    public static SingletonLazyThreadSafeDCL getInstance() {
        if (singletonLazyThreadSafeDCL_Instance == null) {
            synchronized (SingletonLazyThreadSafeDCL.class) {

                // Double ckecking as the above step can be reached by multiple threads 
                if (singletonLazyThreadSafeDCL_Instance == null) {
                    singletonLazyThreadSafeDCL_Instance = new SingletonLazyThreadSafeDCL();
                }
            }
        }

        return singletonLazyThreadSafeDCL_Instance;
    }

    private SingletonLazyThreadSafeDCL() {
    }
}
