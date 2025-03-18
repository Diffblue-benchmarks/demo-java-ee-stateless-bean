package com.diffblue.demo;

import jakarta.ejb.Stateless;

@Stateless
public class AdderImpl {
  public int add(int a, int b) {
    return a + b;
  }
}
