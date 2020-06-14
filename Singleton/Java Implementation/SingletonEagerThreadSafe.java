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