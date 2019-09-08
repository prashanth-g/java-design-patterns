package com.prashanth.os.designpatterns.prototype;

public class PrototypePattern {

  public static void main(String[] args) {
    try {
      PrototypeCapable prototypeCapable = PrototypeFactory.getInstance("show");
      System.out.println("Retrieved " + prototypeCapable.toString() + " as a cloned object");

      PrototypeCapable prototypeCapableSecondAttempt = PrototypeFactory.getInstance("show");
      System.out.println("Retrieved " + prototypeCapableSecondAttempt.toString() + " as a cloned object");
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
