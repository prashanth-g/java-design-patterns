package com.prashanth.os.designpatterns.decorator;

public class ClientFontDecorator extends ClientDecorator {

  public ClientFontDecorator(Report report) {
    super(report);
  }

  @Override
  public String getStyle() {
    return addFont(super.getStyle());
  }

  private String addFont(String existingStyle) {
    return existingStyle + " + " + "font style";
  }
}
