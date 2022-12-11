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

/**
 * String book = “<Massive Lengthy String - HTML, XML, JSON or anything heavy>”;
 *
 * // Costly operation
 * BookParser bp = new BookParser(book);
 *
 * // Cheap operations once costly one is already done
 * bp.numberOfPagers()
 * bp.numberOfChapters();
 * bp.numberOfAdverbs();
 *
 * We can stick a proxy in between whoever calls the BookParser/ whoever calls the book parser methods
 *
 *              new
 * Client ---------—> BookParser
 *              Calls
 *
 *
 *              new
 * Client —————> Proxy ————> BookParser
 *              Calls
 *
 * poxy has to cache the book parser
 */
