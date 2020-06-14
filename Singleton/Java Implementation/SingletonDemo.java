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