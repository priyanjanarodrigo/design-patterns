package com.myorg.pp.implementation.virtualproxypattern;

public class LazyBookParserProxy implements IBookParser {

  private BookParser bookParser;

  private String book;

  public LazyBookParserProxy(String book) {
    this.book = book;
  }

  public int getNumberOfPages() {
    if (bookParser == null) {
      bookParser = new BookParser(this.book);
    }

    return bookParser.getNumberOfPages();
  }
}
