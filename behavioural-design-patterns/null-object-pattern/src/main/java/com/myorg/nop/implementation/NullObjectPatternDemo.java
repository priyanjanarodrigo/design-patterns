package com.myorg.nop.implementation;

public class NullObjectPatternDemo {
  /**
   * Null Object Pattern:
   * --------------------
   *    In Null Object Pattern, a null object replaces check of NULL object instance. Instead of putting if check for
   *    a null value, Null object reflects a do nothing relationship.
   *
   *    Such null object can also be used to provide default behaviour in case data is not available.
   *
   *    In null object pattern, we create an abstract class (or interface) specifying various operations to be done,
   *    concrete classes extending this class(or implementing this interface) and a null object class providing
   *    do nothing implementation of this class (or interface) and will be used seamlessly where we need to check null
   *    value.
   *
   * Resource Links:
   *      https://www.youtube.com/watch?v=rQ7BzfRz7OY
   *      https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
   */

  /**
   * Java main method
   *
   * @param args String array arguments
   */
  public static void main(String[] args) {

    /**
     * Available names in Customer Factory class:
     * private static final String[] names = {"Roman", "Rock", "cena", "ambrose", "seth", "brock"};
     */

    AbstractCustomer customer1 = CustomerFactory.getCustomer("roman");
    AbstractCustomer customer2 = CustomerFactory.getCustomer("brown");
    AbstractCustomer customer3 = CustomerFactory.getCustomer("seth");
    AbstractCustomer customer4 = CustomerFactory.getCustomer("jeff");

    System.out.println(customer1.getName());
    System.out.println(customer1.isNull());
    System.out.println(customer2.getName());
    System.out.println(customer2.isNull());
    System.out.println(customer3.getName());
    System.out.println(customer3.isNull());
    System.out.println(customer4.getName());
    System.out.println(customer4.isNull());
  }
}
