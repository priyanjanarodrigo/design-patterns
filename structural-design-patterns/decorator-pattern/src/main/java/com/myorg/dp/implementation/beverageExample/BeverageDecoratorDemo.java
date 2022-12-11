package com.myorg.dp.implementation.beverageExample;

public class BeverageDecoratorDemo {

  public static void main(String[] args) {
    // Instantiating just a plain coffee. (No toppings added/not decorated)
    Beverage plainCoffee = new PlainCoffee();
    plainCoffee.getDescription();
    System.out.println(plainCoffee.getCost() + "\n");

    // Instantiating just an espresso. (No toppings added/not decorated)
    Beverage espresso = new Espresso();
    espresso.getDescription();
    System.out.println(espresso.getCost() + "\n");

    // Instantiating a caramel plain coffee
    Beverage caramelCoffee = new CaramelDecorator(new PlainCoffee());
    caramelCoffee.getDescription();
    System.out.println(caramelCoffee.getCost() + "\n");

    // Instantiating a espresso with soy milk
    Beverage espressoWithSoyMilk = new SoyMilkDecorator(new Espresso());
    espressoWithSoyMilk.getDescription();
    System.out.println(espressoWithSoyMilk.getCost() + "\n");

    // Instantiating a plain coffee with caramel and soy milk both (multiple decorators)
    Beverage plainCoffeeWithCaramelAndSoyMilk = new CaramelDecorator(new SoyMilkDecorator(new PlainCoffee()));
    plainCoffeeWithCaramelAndSoyMilk.getDescription();
    System.out.println(plainCoffeeWithCaramelAndSoyMilk.getCost() + "\n");
  }
}
