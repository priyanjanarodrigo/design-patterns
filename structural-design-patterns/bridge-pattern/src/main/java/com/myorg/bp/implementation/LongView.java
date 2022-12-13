package com.myorg.bp.implementation;

// LongView refers to RefinedAbstraction which extends the Abstraction View
public class LongView extends View {

  public LongView(IResource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return "{ "
        + "\n\ttitle: " + resource.getTitle()
        + ",\n\timageUrl: " + resource.getImageUrl()
        + ",\n\tsnippet: " + resource.getSnippet()
        + "\n}";
  }
}
