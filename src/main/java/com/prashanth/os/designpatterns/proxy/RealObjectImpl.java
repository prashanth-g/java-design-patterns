package com.prashanth.os.designpatterns.proxy;

public class RealObjectImpl implements RealObject {

  @Override
  public void doWork() {
    System.out.println("Inside the real object");
  }
}
