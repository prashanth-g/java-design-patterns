package com.prashanth.os.designpatterns.proxy;

public class RealObjectProxy extends RealObjectImpl {
  @Override
  public void doWork() {
    System.out.println("Inside the proxy object");
    super.doWork();
  }
}
