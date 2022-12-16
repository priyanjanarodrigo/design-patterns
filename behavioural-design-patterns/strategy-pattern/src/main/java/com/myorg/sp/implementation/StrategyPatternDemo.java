package com.myorg.sp.implementation;

import com.myorg.sp.implementation.strategyImpl.AddingStrategy;
import com.myorg.sp.implementation.strategyImpl.MultiplyingStrategy;
import com.myorg.sp.implementation.strategyImpl.SubstractingStrategy;

public class StrategyPatternDemo {
  /**
   * Strategy Pattern:
   * -----------------
   *
   * Definition:
   *    Strategy pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
   *    Strategy lets the algorithm vary independently, from the clients (contexts) that use it.
   *
   *    In Strategy pattern, a class behaviour or its algorithm can be changed at runtime.
   *
   * Note:
   *    It's about using composition rather than inheritance. It's about understanding that inheritance is not intended
   *    for code reuse.
   *
   * Reference Links:
   *    https://www.youtube.com/watch?v=v9ejT8FO-7I
   *    https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
   *
   *
   * Clarification/ Definition Breakdown:
   * ------------------------------------
   *
   *    1. Strategy pattern defines a family of algorithms:
   *        - When we are using Strategy pattern, we have a family/set of algorithms that we want to use.
   *
   *    2. Encapsulates each one and makes them interchangeable:
   *        - Which means that we have these algorithms as mentioned above and those are interchangeable
   *
   *        - For example, Consider we have algorithm A,B,C and D. Simply with Strategy pattern we can plug and play
   *          those. (sometimes A, sometimes C and likewise)
   *
   *    3. Strategy lets the algorithm vary independently, from the clients that use it:
   *        -  Which simply means decoupling the algorithm from the one (client) who's using it.
   *
   *        - That client does not have to vary, if one of the algorithms vary. If we want to change one of the
   *          algorithms (contents of the algorithms), we don't necessarily  have to change the client at the same time.
   *
   *        - Whoever is using that algorithm, is not forced to change when we are changing one of the algorithm(s).
   */

  /**
   * Java main method
   *
   * @param args String[] arguments
   */
  public static void main(String[] args) {
    Context additionContext = new Context(new AddingStrategy());
    System.out.println(additionContext.executeStrategy(10, 20));

    Context substractionContext = new Context(new SubstractingStrategy());
    System.out.println(substractionContext.executeStrategy(120, 60));

    Context multiplicationContext = new Context(new MultiplyingStrategy());
    System.out.println(multiplicationContext.executeStrategy(20, 10));
  }
}
