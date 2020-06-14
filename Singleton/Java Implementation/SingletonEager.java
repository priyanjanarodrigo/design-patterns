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