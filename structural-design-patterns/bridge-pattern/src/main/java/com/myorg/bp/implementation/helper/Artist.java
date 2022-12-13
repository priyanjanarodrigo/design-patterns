package com.myorg.bp.implementation.helper;

public class Artist {

  private String name;

  private String imageUrl;

  private String bio;

  public String getName() {
    return this.name;
  }

  public String getImageUrl() {
    return this.imageUrl;
  }

  public String getBio() {
    return this.bio;
  }

  public Artist(String name, String imageUrl, String bio) {
    this.name = name;
    this.imageUrl = imageUrl;
    this.bio = bio;
  }
}
