package com.diffblue.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorDiffblueTest {
  @Mock
  private AdderImpl adderImpl;

  @InjectMocks
  private Calculator calculator;

  /**
   * Test {@link Calculator#sumOf(int, int)}.
   * <ul>
   *   <li>When minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Calculator#sumOf(int, int)}
   */
  @Test
  @DisplayName("Test sumOf(int, int); when minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_whenMinusOne() {
    // Arrange
    when(adderImpl.add(anyInt(), anyInt())).thenReturn(2);

    // Act
    int actualSumOfResult = calculator.sumOf(-1, 3);

    // Assert
    verify(adderImpl).add(eq(-1), eq(3));
    assertEquals(2, actualSumOfResult);
  }

  /**
   * Test {@link Calculator#sumOf(int, int)}.
   * <ul>
   *   <li>When one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Calculator#sumOf(int, int)}
   */
  @Test
  @DisplayName("Test sumOf(int, int); when one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_whenOne() {
    // Arrange
    when(adderImpl.add(anyInt(), anyInt())).thenReturn(2);

    // Act
    int actualSumOfResult = calculator.sumOf(1, 3);

    // Assert
    verify(adderImpl).add(eq(1), eq(3));
    assertEquals(2, actualSumOfResult);
  }

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
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_whenThree() {
    // Arrange
    when(adderImpl.add(anyInt(), anyInt())).thenReturn(2);

    // Act
    int actualSumOfResult = calculator.sumOf(3, 3);

    // Assert
    verify(adderImpl).add(eq(3), eq(3));
    assertEquals(2, actualSumOfResult);
  }

  /**
   * Test {@link Calculator#sumOf(int, int)}.
   * <ul>
   *   <li>When zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Calculator#sumOf(int, int)}
   */
  @Test
  @DisplayName("Test sumOf(int, int); when zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Calculator.sumOf(int, int)"})
  void testSumOf_whenZero() {
    // Arrange
    when(adderImpl.add(anyInt(), anyInt())).thenReturn(2);

    // Act
    int actualSumOfResult = calculator.sumOf(0, 3);

    // Assert
    verify(adderImpl).add(eq(0), eq(3));
    assertEquals(2, actualSumOfResult);
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
