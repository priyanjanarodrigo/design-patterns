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