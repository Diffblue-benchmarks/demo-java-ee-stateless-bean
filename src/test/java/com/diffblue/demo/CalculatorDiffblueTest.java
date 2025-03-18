package com.diffblue.demo;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculatorDiffblueTest {
  /**
   * Test {@link Calculator#sumOf(int, int)}.
   * <ul>
   *   <li>When three.</li>
   * </ul>
   * <p>
   * Method under test: {@link Calculator#sumOf(int, int)}
   */
  @Test
  @DisplayName("Test sumOf(int, int); when three")
  @Disabled("TODO: Complete this test")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_whenThree() {
    // TODO: Diffblue Cover was only able to create a partial test for this method:
    //   Reason: No inputs found that don't throw a trivial exception.
    //   Diffblue Cover tried to run the arrange/act section, but the method under
    //   test threw
    //   java.lang.NullPointerException: Cannot invoke "com.diffblue.demo.AdderImpl.add(int, int)" because "this.adder" is null
    //   See https://diff.blue/R013 to resolve this issue.

    // Arrange and Act
    (new Calculator()).sumOf(3, 3);
  }

  /**
   * Test new {@link Calculator} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link Calculator}
   */
  @Test
  @DisplayName("Test new Calculator (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Calculator.<init>()"})
  void testNewCalculator() {
    // TODO: Diffblue Cover was only able to create a partial test for this method:
    //   Reason: Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   Add getters for the following fields or make them package-private:
    //     Calculator.adder

    // Arrange and Act
    new Calculator();
  }
}
