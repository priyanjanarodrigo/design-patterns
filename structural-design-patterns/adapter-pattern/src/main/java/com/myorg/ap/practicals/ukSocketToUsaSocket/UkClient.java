package com.myorg.ap.practicals.ukSocketToUsaSocket;

public class UkClient {

  public static void main(String[] args) {
    ITarget iTarget = new UkToUsaSocketAdapter(new UsaSocketAdaptee());
    iTarget.plugToUkSocket();
  }
}
