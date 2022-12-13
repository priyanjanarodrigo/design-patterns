package com.myorg.bp.implementation;

// ShortView refers to RefinedAbstraction which extends the Abstraction View
public class ShortView extends View {

  public ShortView(IResource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return "{"
        + "\n\ttitle: " + resource.getTitle() + ","
        + "\n\timageUrl: " + resource.getImageUrl()
        + "\n}";
  }
}
