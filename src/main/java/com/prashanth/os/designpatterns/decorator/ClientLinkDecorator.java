package com.prashanth.os.designpatterns.decorator;

public class ClientLinkDecorator extends ClientDecorator {

  public ClientLinkDecorator(Report report) {
    super(report);
  }

  @Override
  public String getStyle() {
    return addColor(super.getStyle());
  }

  private String addColor(String existingStyle) {
    return existingStyle + " + " + "color style";
  }
}
