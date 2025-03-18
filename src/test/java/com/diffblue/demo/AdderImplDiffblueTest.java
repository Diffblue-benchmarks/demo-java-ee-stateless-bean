package com.diffblue.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AdderImplDiffblueTest {
  /**
   * Test {@link AdderImpl#add(int, int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return three.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdderImpl#add(int, int)}
   */
  @Test
  @DisplayName("Test add(int, int); when one; then return three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AdderImpl.add(int, int)"})
  void testAdd_whenOne_thenReturnThree() {
    // Arrange, Act and Assert
    assertEquals(3, (new AdderImpl()).add(1, 2));
  }

  /**
   * Test {@link AdderImpl#add(int, int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return five.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdderImpl#add(int, int)}
   */
  @Test
  @DisplayName("Test add(int, int); when three; then return five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AdderImpl.add(int, int)"})
  void testAdd_whenThree_thenReturnFive() {
    // Arrange, Act and Assert
    assertEquals(5, (new AdderImpl()).add(3, 2));
  }

  /**
   * Test {@link AdderImpl#add(int, int)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then return four.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdderImpl#add(int, int)}
   */
  @Test
  @DisplayName("Test add(int, int); when two; then return four")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AdderImpl.add(int, int)"})
  void testAdd_whenTwo_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4, (new AdderImpl()).add(2, 2));
  }

  /**
   * Test {@link AdderImpl#add(int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdderImpl#add(int, int)}
   */
  @Test
  @DisplayName("Test add(int, int); when zero; then return two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AdderImpl.add(int, int)"})
  void testAdd_whenZero_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2, (new AdderImpl()).add(0, 2));
  }

  /**
   * Test new {@link AdderImpl} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link AdderImpl}
   */
  @Test
  @DisplayName("Test new AdderImpl (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AdderImpl.<init>()"})
  void testNewAdderImpl() {
    // TODO: Diffblue Cover was only able to create a partial test for this method:
    //   Reason: Missing observers.
    //   Diffblue Cover was unable to create an assertion.
    //   There are no fields that could be asserted on.

    // Arrange and Act
    new AdderImpl();
  }
}
