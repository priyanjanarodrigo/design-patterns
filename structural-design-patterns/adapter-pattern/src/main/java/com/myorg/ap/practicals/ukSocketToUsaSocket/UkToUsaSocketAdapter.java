package com.myorg.ap.practicals.ukSocketToUsaSocket;

public class UkToUsaSocketAdapter implements ITarget {

  private UsaSocketAdaptee usaSocketAdaptee;

  public UkToUsaSocketAdapter(UsaSocketAdaptee usaSocketAdaptee) {
    this.usaSocketAdaptee = usaSocketAdaptee;
  }

  public void plugToUkSocket() {
    this.usaSocketAdaptee.plugToUsaSocket();
  }
}
