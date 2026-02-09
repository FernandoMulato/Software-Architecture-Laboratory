package com.fernandomulato.model;

/**
 * Represents a geometric figure of type square.
 * <p>
 * This class extends {@link ClsFigure} and implements the required
 * methods to calculate the area and perimeter of a square based on
 * the length of one of its sides.
 * </p>
 *
 * @author Henry Fernando Mulato Llanten
 * @license MIT License
 */
public class ClsSquare extends ClsFigure {
  // region Attributes

  /**
   * Length of the square's side.
   */
  private double attSide;

  // endregion
  // region Operations

  // region Constructors

  /**
   * Constructs a square with the specified side length.
   *
   * @param prmSide initial side length of the square
   * @throws IllegalArgumentException if side is negative
   */
  public ClsSquare(double prmSide) {

    if (prmSide < 0) {
      throw new IllegalArgumentException(
          "The side cannot be negative.");
    }
    this.attSide = prmSide;
  }

  // endregion
  // region Getters and Setters

  /**
   * Returns the length of the square's side.
   *
   * @return side length of the square
   */
  public double getAttSide() {
    return this.attSide;
  }

  /**
   * Updates the length of the square's side.
   *
   * @param prmNewSide new side length
   */
  public void setAttSide(double prmNewSide) {
    this.attSide = prmNewSide;
  }

  // endregion
  // region Legacy Operations

  /**
   * Calculates the area of the square.
   * <p>
   * The result is rounded to one decimal place.
   * </p>
   *
   * @return area of the square
   */
  @Override
  public double opCalculateArea() {
    double varResult = attSide * attSide;

    return Math.round(varResult * 10.0) / 10.0;
  }

  /**
   * Calculates the perimeter of the square.
   *
   * @return perimeter of the square
   */
  @Override
  public double opCalculatePerimeter() {
    return (double) (4 * attSide);
  }
  // endregion

  // endregion
}
