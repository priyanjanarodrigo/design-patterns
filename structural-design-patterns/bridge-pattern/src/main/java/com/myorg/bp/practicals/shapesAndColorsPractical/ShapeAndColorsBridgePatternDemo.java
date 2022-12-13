package com.myorg.bp.practicals.shapesAndColorsPractical;

public class ShapeAndColorsBridgePatternDemo {

  public static void main(String[] args) {
    /**
     * Cartesian Product Related Sets:
     *  set1 = { Rectangle, Circle }
     *  set2 = { RedPaint, YellowPaint }
     *
     * Ordered Pairs:
     *  { Rectangle, RedPaint }
     *  { Rectangle, YellowPaint }
     *  { Circle, RedPaint }
     *  { Circle, YellowPaint }
     */

    Shape redRectangle = new Rectangle(new RedPaint());
    System.out.println(redRectangle.show() + "\n");

    Shape yellowRectangle = new Rectangle(new YellowPaint());
    System.out.println(yellowRectangle.show() + "\n");

    Shape redCircle = new Circle(new RedPaint());
    System.out.println(redCircle.show() + "\n");

    Shape yellowCircle = new Circle(new YellowPaint());
    System.out.println(yellowCircle.show() + "\n");
  }
}
