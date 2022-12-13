package com.myorg.bp.implementation;

import com.myorg.bp.implementation.helper.Artist;

// ArtistResource refers to a ConcreteImplementor which implements the Implementor IResource
public class ArtistResource implements IResource {

  private Artist artist;

  public ArtistResource(Artist artist) {
    this.artist = artist;
  }

  @Override
  public String getSnippet() {
    return artist.getBio();
  }

  @Override
  public String getTitle() {
    return artist.getName();
  }

  @Override
  public String getImageUrl() {
    return artist.getImageUrl();
  }
}
