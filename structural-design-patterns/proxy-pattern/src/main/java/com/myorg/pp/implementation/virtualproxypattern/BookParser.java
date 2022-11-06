package com.myorg.pp.implementation.virtualproxypattern;

public class BookParser implements IBookParser {

  private int numberOfPages;

  public BookParser(String book) {
    // The expensive parsing operation goes here. This is just a sample implementation.
    System.out.println("Performing costly/expensive operation");
    numberOfPages = book.length() * 12 + 200;
  }

  public int getNumberOfPages() {
    return this.numberOfPages;
  }
}
