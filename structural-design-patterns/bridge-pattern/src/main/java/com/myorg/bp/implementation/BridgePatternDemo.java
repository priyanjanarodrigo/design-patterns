package com.myorg.bp.implementation;

import com.myorg.bp.implementation.helper.Artist;
import com.myorg.bp.implementation.helper.Book;

public class BridgePatternDemo {

  public static void main(String[] args) {
    /**
     * Creating and getting helper resources ready (Artist and Book).
     * This part is out of the scope of Bridge pattern but required for more clarity within the
     * example implementation.
     */
    Artist michaelJackson = new Artist("Micheal Joseph Jackson",
        "https://www.mj-music.com/mj-image.png",
        "Michael Joseph Jackson (August 29, 1958 – June 25, 2009) was an American singer, "
            + "songwriter, dancer, and philanthropist. Dubbed the \"King of Pop\", he is regarded "
            + "as one of the most significant cultural figures of the 20th century");

    Book richDadPoorDad = new Book("Rich Dad Poor Dad",
        "https://www.rdpd.com/rich-dad-poor-dad/main/book-image.png",
        "Rich people acquire assets. The poor and middle class acquire liabilities that they think are assets");

    /**
     * Bridge Pattern specific code
     *
     * Following are the combination based on Cartesian Product which defines ordered pairs:
     *
     * RefinedAbstractions:
     * --------------------
     *    set1 = { LongView, ShortView }
     *
     * ConcreteImplementors:
     * ---------------------
     *    set2 = { ArtistResource, BookResource }
     *
     * OrderedPairs:
     * --------------
     *  { LongView, ArtistResource }
     *  { LongView, BookResource }
     *  { ShortView, ArtistResource }
     *  { ShortView, BookResource }
     */

    View longViewArtistResource = new LongView(new ArtistResource(michaelJackson));
    System.out.println(longViewArtistResource.show() + "\n");

    View longViewBookResource = new LongView(new BookResource(richDadPoorDad));
    System.out.println(longViewBookResource.show() + "\n");

    View shortViewArtistResource = new ShortView(new ArtistResource(michaelJackson));
    System.out.println(shortViewArtistResource.show() + "\n");

    View shortViewBookResource = new ShortView(new BookResource(richDadPoorDad));
    System.out.println(shortViewBookResource.show());
  }
}
