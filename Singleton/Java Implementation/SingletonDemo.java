class SingletonDemo {

    public static void main(String[] args) {

        // SingletonEager execution - START
        System.out.println("SingletonEager - Example\n---------------------------------------------------");

        SingletonEager singletonEagerObject_1 = SingletonEager.getInstance();
        singletonEagerObject_1.setMessage("SingletonEager Changed");
        System.out.println(singletonEagerObject_1.getMessage());

        SingletonEager singletonEagerObject_2 = SingletonEager.getInstance();
        System.out.println(singletonEagerObject_2.getMessage());

        // hashCode() must return the same value for both object references
        System.out.println(singletonEagerObject_1.hashCode());
        System.out.println(singletonEagerObject_2.hashCode());
        // SingletonEager execution - END

        // SingletonLazy execution - START
        System.out.println("\nSingletonLazy - Example\n---------------------------------------------------");

        SingletonLazy singletonLazyObject_1 = SingletonLazy.getInstance();
        singletonLazyObject_1.setMessage("SingletonLazy Changed");
        System.out.println(singletonLazyObject_1.getMessage());

        SingletonLazy singletonLazyObject_2 = SingletonLazy.getInstance();
        System.out.println(singletonLazyObject_2.getMessage());

        // hashCode() must return the same value for both object references
        System.out.println(singletonLazyObject_1.hashCode());
        System.out.println(singletonLazyObject_2.hashCode());
        // SingletonLazy execution - END

        // SingletonEagerThreadSafe execution - START
        System.out.println("\nSingletonEagerThreadSafe - Example\n---------------------------------------------------");

        SingletonEagerThreadSafe singletonEagerThreadSafeObject_1 = SingletonEagerThreadSafe.getInstance();
        singletonEagerThreadSafeObject_1.setMessage("SingletonEagerThreadSafe Changed");
        System.out.println(singletonEagerThreadSafeObject_1.getMessage());

        SingletonEagerThreadSafe singletonEagerThreadSafeObject_2 = SingletonEagerThreadSafe.getInstance();
        System.out.println(singletonEagerThreadSafeObject_2.getMessage());

        // hashCode() must return the same value for both object references
        System.out.println(singletonEagerThreadSafeObject_1.hashCode());
        System.out.println(singletonEagerThreadSafeObject_2.hashCode());
        // SingletonEagerThreadSafe execution - END

        // SingletonLazyThreadSafe execution - START
        System.out.println("\nSingletonLazyThreadSafe - Example\n---------------------------------------------------");

        SingletonLazyThreadSafe singletonLazyThreadSafeObject_1 = SingletonLazyThreadSafe.getInstance();
        singletonLazyThreadSafeObject_1.setMessage("SingletonLazyThreadSafe Changed");
        System.out.println(singletonLazyThreadSafeObject_1.getMessage());

        SingletonLazyThreadSafe singletonLazyThreadSafeObject_2 = SingletonLazyThreadSafe.getInstance();
        System.out.println(singletonLazyThreadSafeObject_2.getMessage());

        // hashCode() must return the same value for both object references
        System.out.println(singletonLazyThreadSafeObject_1.hashCode());
        System.out.println(singletonLazyThreadSafeObject_2.hashCode());
        // SingletonLazyThreadSafe execution - END

        // SingletonLazyThreadSafeDLC execution - START
        System.out.println("\nSingletonLazyThreadSafeDLC - Double checked locking - Example\n---------------------------------------------------");

        SingletonLazyThreadSafeDCL singletonLazyThreadSafeO_DCL_Object_1 = SingletonLazyThreadSafeDCL.getInstance();
        singletonLazyThreadSafeO_DCL_Object_1.setMessage("SingletonLazyThreadSafeDLC Changed");
        System.out.println(singletonLazyThreadSafeO_DCL_Object_1.getMessage());

        SingletonLazyThreadSafeDCL singletonLazyThreadSafeO_DCL_Object_2 = SingletonLazyThreadSafeDCL.getInstance();
        System.out.println(singletonLazyThreadSafeO_DCL_Object_2.getMessage());

        // hashCode() must return the same value for both object references
        System.out.println(singletonLazyThreadSafeO_DCL_Object_1.hashCode());
        System.out.println(singletonLazyThreadSafeO_DCL_Object_2.hashCode());
        // SingletonLazyThreadSafeDLC execution - END
    }
}

class SingletonEager {
    private static SingletonEager singletonEagerInstance = new SingletonEager();

    private String message = "SingletonEager";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public static SingletonEager getInstance() {
        return singletonEagerInstance;
    }

    private SingletonEager() {
    }
}

// This is the classic implementation of Singleton pattern (Lazy)
class SingletonLazy {
    private static SingletonLazy singletonLazyInstance = null;

    private String message = "SingletonLazy";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public static SingletonLazy getInstance() {
        if (singletonLazyInstance == null) {
            singletonLazyInstance = new SingletonLazy();
        }
        return singletonLazyInstance;
    }

    private SingletonLazy() {
    }
}

class SingletonEagerThreadSafe {
    private static SingletonEagerThreadSafe singletonEagerThreadSafeInstance = new SingletonEagerThreadSafe();

    private String message = "SingletonEagerThreadSafe";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public static synchronized SingletonEagerThreadSafe getInstance() {
        return singletonEagerThreadSafeInstance;
    }

    private SingletonEagerThreadSafe() {
    }
}

class SingletonLazyThreadSafe {
    private static SingletonLazyThreadSafe singletonLazyThreadSafeInstance = null;

    private String message = "SingletonLazyThreadSafe";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    // This can be executed by one thread at a time. Thread has to acquire the class level lock
    public static synchronized SingletonLazyThreadSafe getInstance() {
        if (singletonLazyThreadSafeInstance == null) {
            singletonLazyThreadSafeInstance = new SingletonLazyThreadSafe();
        }
        return singletonLazyThreadSafeInstance;
    }

    private SingletonLazyThreadSafe() {

    }
}

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
