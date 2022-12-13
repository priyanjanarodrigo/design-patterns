package com.myorg.bp.practicals.shapesAndColorsPractical;

public abstract class Shape {

  protected IPaint paint;

  public Shape(IPaint paint) {
    this.paint = paint;
  }

  protected abstract String show();
}
