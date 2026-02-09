package com.fernandomulato.model;

/**
 * Represents a circle-like geometric figure.
 * <p>
 * This class extends {@link ClsFigure} and implements the methods
 * needed to calculate the area and perimeter of a circle
 * from its radio.
 * </p>
 *
 * @author Henry Fernando Mulato Llanten
 * @license MIT License
 */
public class ClsCircle extends ClsFigure {
  // region Attributes

  /**
   * Circle radius.
   */
  private double attRadius;

  // endregion
  // region Operations

  // region Constructors

  /**
   * Builds a circle with the specified radius.
   *
   * @param prmRadius initial radius of the circle
   * @throws IllegalArgumentException if the radius is negative
   */
  public ClsCircle(double prmRadius) {

    if (prmRadius < 0) {
      throw new IllegalArgumentException(
          "The radius cannot be negative.");
    }
    this.attRadius = prmRadius;
  }

  // endregion
  // region Getters and Setters

  /**
   * Returns the radius of the circle.
   *
   * @return radius of the circle
   */
  public double getAttRadius() {
    return this.attRadius;
  }

  /**
   * Change the radius of the circle.
   *
   * @param prmNewRadius new value of radius
   */
  public void setAttRadius(double prmNewRadius) {
    this.attRadius = prmNewRadius;
  }

  // endregion
  // region Legacy Operations

  /**
   * Calculate the area of the circle.
   * <p>
   * The result is rounded to one decimal place.
   * </p>
   *
   * @return area of the circle
   */
  @Override
  public double opCalculateArea() {

    double varResult = (Math.PI * Math.pow(attRadius, 2));

    return Math.round(varResult * 10.0) / 10.0;
  }

  /**
   * Calculate the perimeter of the circle.
   * <p>
   * The result is rounded to one decimal place.
   * </p>
   *
   * @return perimeter of the circle
   */
  @Override
  public double opCalculatePerimeter() {

    double varResult = (2 * Math.PI * attRadius);

    return Math.round(varResult * 10.0) / 10.0;
  }

  // endregion

  // endregion
}
