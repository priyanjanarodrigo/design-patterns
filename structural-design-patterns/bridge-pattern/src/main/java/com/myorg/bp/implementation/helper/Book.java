package com.myorg.bp.implementation.helper;

public class Book {

  private String title;

  private String imageUrl;

  private String snippet;

  public String getTitle() {
    return this.title;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public String getSnippet() {
    return this.snippet;
  }

  public Book(String title, String imageUrl, String snippet) {
    this.title = title;
    this.imageUrl = imageUrl;
    this.snippet = snippet;
  }
}
