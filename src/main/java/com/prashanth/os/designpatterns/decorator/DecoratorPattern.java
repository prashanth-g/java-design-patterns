package com.prashanth.os.designpatterns.decorator;

public class DecoratorPattern {

  public static void main(String[] args) {
    ClientLinkDecorator clientLinkDecorator = new ClientLinkDecorator(new ClientFontDecorator(new ClientReport()));
    System.out.println(clientLinkDecorator.getStyle());
  }
}
