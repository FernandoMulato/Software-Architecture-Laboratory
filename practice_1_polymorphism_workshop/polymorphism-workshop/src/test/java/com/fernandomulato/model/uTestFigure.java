package com.fernandomulato.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for figure area and perimeter calculations.
 * 
 * This class verifies correct behavior for different geometric figures
 * such as Circle, Square, and Triangle, including valid and invalid inputs.
*/
class uTestFigure {

  double testExpectedArea;
  double testExpectedPerimeter;

  @Test
  void testShouldCalculateAreaAndPerimeterCorrectly_whenCircleHasValidRadius() {
    // Arrange
    ClsFigure testMyCircle = new ClsCircle(6);

    // Act
    testExpectedArea = testMyCircle.opCalculateArea();
    testExpectedPerimeter = testMyCircle.opCalculatePerimeter();

    // Assert
    assertEquals(113.1, testExpectedArea);
    assertEquals(37.7, testExpectedPerimeter);
  }

  @Test
  void testShouldCalculateAreaAndPerimeterCorrectly_whenSquareHasValidSide() {
    // Arrange
    ClsFigure testMySquare = new ClsSquare(14.1);

    // Act
    testExpectedArea = testMySquare.opCalculateArea();
    testExpectedPerimeter = testMySquare.opCalculatePerimeter();

    // Assert
    assertEquals(198.8, testExpectedArea);
    assertEquals(56.4, testExpectedPerimeter);
  }

  @Test
  void testShouldCalculateAreaCorrectly_whenTriangleHasBaseAndHeight() {
    // Arrange
    ClsFigure testMyTriangle = new ClsTriangle(4, 6.1);

    // Act
    testExpectedArea = testMyTriangle.opCalculateArea();

    // Assert
    assertEquals(12.2, testExpectedArea);
  }

  @Test
  void testShouldCalculatePerimeterCorrectly_whenTriangleHasThreeSides() {
    // Arrange
    ClsFigure testMyTriangle = new ClsTriangle(4.1, 6, 8);

    // Act
    testExpectedPerimeter = testMyTriangle.opCalculatePerimeter();

    // Assert
    assertEquals(18.1, testExpectedPerimeter);
  }

  @Test
  void testShouldThrowException_whenCircleRadiusIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsCircle(-5);
    });
  }

  @Test
  void testShouldThrowException_whenSquareSideIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsSquare(-0.9);
    });
  }

  @Test
  void testShouldThrowException_whenTriangleBaseIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsTriangle(-4, 12);
    });
  }

  @Test
  void testShouldThrowException_whenTriangleHeightIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsTriangle(4, -12);
    });
  }

  @Test
  void testShouldThrowException_whenTriangleSidesAIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsTriangle(-2, 5, 6);
    });
  }

  @Test
  void testShouldThrowException_whenTriangleSidesBIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsTriangle(2, -5, 6);
    });
  }

  @Test
  void testShouldThrowException_whenTriangleSidesCIsNegative() {
    assertThrows(IllegalArgumentException.class, () -> {
      new ClsTriangle(2, 5, -6);
    });
  }
}
