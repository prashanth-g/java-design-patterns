package com.prashanth.os.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
  private static Map<String, PrototypeCapable> prototypeCapableMap = new HashMap<>();

  static {
    prototypeCapableMap.put("show", new Show());
  }

  public static PrototypeCapable getInstance(final String type)
      throws CloneNotSupportedException {
    return (PrototypeCapable) prototypeCapableMap.get(type).clone();
  }
}
