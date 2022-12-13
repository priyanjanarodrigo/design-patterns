package com.myorg.bp.implementation;

// View refers to the Abstraction
public abstract class View {

  protected IResource resource;

  public View(IResource resource) {
    this.resource = resource;
  }

  protected abstract String show();
}
