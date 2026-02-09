package com.fernandomulato.model;

/**
 * 
 * Abstract class representing a generic geometric figure.
 * <p>
 * Defines the basic structure for all figures, providing
 * position attributes and operations to calculate area and perimeter.
 * </p>
 *
 * Classes that inherit from {@code ClsFigure} must implement
 * the calculation methods according to their specific geometry.
 *
 * @author Henry Fernando Mulato Llanten
 * @email henrymulato@unicauca.edu.co
 * @license MIT License
 */
public abstract class ClsFigure {
  // region Attributes

  /**
   * Coordinate X of the reference point in the figure.
   */
  protected double attX1;

  /**
   * 
   * Coordinate Y of the reference point in the figure.
   */
  protected double attY1;

  // endregion
  // region Operations

  /**
   * Calculate the area of the figure.
   *
   * @return area of the figure in square units
   */
  public abstract double opCalculateArea();

  /**
   * Calculate the perimeter of the figure.
   *
   * @return perimeter of the figure in linear units
   */
  public abstract double opCalculatePerimeter();

  // endregion
}
