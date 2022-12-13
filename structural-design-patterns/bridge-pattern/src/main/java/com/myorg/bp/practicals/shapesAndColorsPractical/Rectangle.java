package com.myorg.bp.practicals.shapesAndColorsPractical;

public class Rectangle extends Shape {

  public Rectangle(IPaint paint) {
    super(paint);
  }

  @Override
  public String show() {
    return "Rectangle -> "+ paint.applyColor();
  }
}
