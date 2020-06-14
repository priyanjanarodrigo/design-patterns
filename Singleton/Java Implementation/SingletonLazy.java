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