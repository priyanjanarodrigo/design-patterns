package com.myorg.bp.practicals.shapesAndColorsPractical;

public class Circle extends Shape {

  public Circle(IPaint paint) {
    super(paint);
  }

  @Override
  public String show(){
    return "Circle -> "+paint.applyColor();
  }

}
