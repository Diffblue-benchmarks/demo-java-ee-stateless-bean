package com.diffblue.demo;

import jakarta.inject.Inject;

public class Calculator {
  @Inject
  public AdderImpl adder;

  public int sumOf(int a, int b) {
    return this.adder.add(a, b);
  }
}
