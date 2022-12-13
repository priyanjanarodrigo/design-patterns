package com.myorg.bp.implementation;

import com.myorg.bp.implementation.helper.Book;

// BookResource refers to a ConcreteImplementor which implements the Implementor IResource
public class BookResource implements IResource {

  private Book book;

  public BookResource(Book book) {
    this.book = book;
  }

  @Override
  public String getSnippet() {
    return this.book.getSnippet();
  }

  @Override
  public String getTitle() {
    return this.book.getTitle();
  }

  @Override
  public String getImageUrl() {
    return this.book.getImageUrl();
  }
}
