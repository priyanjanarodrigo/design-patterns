package com.myorg.pp.implementation.virtualproxypattern;

public class ProxyDemo {

  public static void main(String[] args) {
    String book = "sample heavy book content";
    LazyBookParserProxy proxy = new LazyBookParserProxy(book);

    System.out.println(proxy.getNumberOfPages()); // initial call
    System.out.println(proxy.getNumberOfPages()); // Second call

    /**
     * Output (Costly operation will be executed only once):
     *
     *    Performing costly/expensive operation
     *    500
     *    500
     */
  }
}
