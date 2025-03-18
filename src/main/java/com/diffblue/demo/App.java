package com.diffblue.demo;

import javax.naming.Context;
import javax.naming.InitialContext;

public class App {
  public static void main(String[] args) throws Exception {
    Context context = new InitialContext();
    Calculator calculator = new Calculator();
    System.out.println(calculator.sumOf(10, 20));
  }
}
