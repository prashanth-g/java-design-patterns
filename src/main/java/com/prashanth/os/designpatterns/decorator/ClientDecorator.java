package com.prashanth.os.designpatterns.decorator;

public abstract class ClientDecorator implements Report {

  private Report report;

  public ClientDecorator(Report report) {
    this.report = report;
  }

  @Override
  public String getStyle() {
    return report.getStyle();
  }

}
