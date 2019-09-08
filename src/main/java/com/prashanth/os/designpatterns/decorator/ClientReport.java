package com.prashanth.os.designpatterns.decorator;

public class ClientReport implements Report {

  @Override
  public String getStyle() {
    return "default style";
  }
}
