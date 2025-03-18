package com.diffblue.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculatorDiffblueTest {
  /**
   * Test {@link Calculator#sumOf(int, int)}.
   * <ul>
   *   <li>Given {@link AdderImpl} {@link AdderImpl#add(int, int)} return two.</li>
   *   <li>When three.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Calculator#sumOf(int, int)}
   */
  @Test
  @DisplayName("Test sumOf(int, int); given AdderImpl add(int, int) return two; when three; then return two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_givenAdderImplAddReturnTwo_whenThree_thenReturnTwo() {
    // Arrange
    AdderImpl adderImpl = mock(AdderImpl.class);
    when(adderImpl.add(anyInt(), anyInt())).thenReturn(2);
    Calculator calculator = new Calculator();
    calculator.adder = adderImpl;

    // Act
    int actualSumOfResult = calculator.sumOf(3, 3);

    // Assert
    verify(adderImpl).add(eq(3), eq(3));
    assertEquals(2, actualSumOfResult);
  }

  /**
   * Test {@link Calculator#sumOf(int, int)}.
   * <ul>
   *   <li>Given {@link Calculator} (default constructor) {@link Calculator#adder} is {@link AdderImpl} (default constructor).</li>
   *   <li>When three.</li>
   *   <li>Then return six.</li>
   * </ul>
   * <p>
   * Method under test: {@link Calculator#sumOf(int, int)}
   */
  @Test
  @DisplayName("Test sumOf(int, int); given Calculator (default constructor) adder is AdderImpl (default constructor); when three; then return six")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_givenCalculatorAdderIsAdderImpl_whenThree_thenReturnSix() {
    // Arrange
    Calculator calculator = new Calculator();
    calculator.adder = new AdderImpl();

    // Act and Assert
    assertEquals(6, calculator.sumOf(3, 3));
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
    // Arrange, Act and Assert
    assertNull((new Calculator()).adder);
  }
}
