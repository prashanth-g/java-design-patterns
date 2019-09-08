package com.prashanth.os.designpatterns.prototype;

public class Show implements PrototypeCapable {

  static  {
    System.out.println("Object creation for the first time!");
  }

  @Override
  public PrototypeCapable clone() throws CloneNotSupportedException {
    return (Show) super.clone();
  }

  @Override
  public String toString() {
    return "SHOW";
  }
}
