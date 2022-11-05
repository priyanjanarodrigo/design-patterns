package com.myorg.ap.implementation;

public class Client {

  public static void main(String[] args) {
    ITarget iTarget = new Adapter(new Adaptee());
    iTarget.request();
  }
}
