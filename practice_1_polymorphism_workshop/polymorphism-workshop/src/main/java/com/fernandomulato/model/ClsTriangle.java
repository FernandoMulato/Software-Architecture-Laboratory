package com.fernandomulato.model;

/**
 * Represents a geometric figure of type triangle.
 * <p>
 * This class extends {@link ClsFigure} and provides implementations
 * to calculate the area and perimeter of a triangle.
 * </p>
 *
 * <p>
 * The area is calculated using the base and height of the triangle,
 * while the perimeter is calculated using the lengths of its three sides.
 * </p>
 *
 * @author Henry Fernando Mulato Llanten
 * @license MIT License
 */
public class ClsTriangle extends ClsFigure {
  // region Attributes

  /**
   * Base length of the triangle.
   */
  private double attBase;

  /**
   * Height of the triangle.
   */
  private double attHeight;

  /**
   * Length of side A of the triangle.
   */
  private double attSideA;

  /**
   * Length of side B of the triangle.
   */
  private double attSideB;

  /**
   * Length of side C of the triangle.
   */
  private double attSideC;

  // endregion
  // region Operations

  // region Constructors

  /**
   * Constructs a triangle using its base and height.
   * <p>
   * This constructor is intended for area calculation.
   * </p>
   *
   * @param prmBase   base length of the triangle
   * @param prmHeight height of the triangle
   * @throws IllegalArgumentException if base or height are negative
   */
  public ClsTriangle(double prmBase, double prmHeight) {

    if (prmBase < 0 || prmHeight < 0) {
      throw new IllegalArgumentException(
          "Base or height cannot be negative.");
    }

    this.attBase = prmBase;
    this.attHeight = prmHeight;
  }

  /**
   * Constructs a triangle using the lengths of its three sides.
   * <p>
   * This constructor is intended for perimeter calculation.
   * </p>
   *
   * @param prmSideA length of side A
   * @param prmSideB length of side B
   * @param prmSideC length of side C
   * @throws IllegalArgumentException if sides are negative
   */
  public ClsTriangle(
      double prmSideA,
      double prmSideB,
      double prmSideC) {

    if (prmSideA < 0 || prmSideB < 0 || prmSideC < 0) {
      throw new IllegalArgumentException(
          "Base or height cannot be negative.");
    }
    this.attSideA = prmSideA;
    this.attSideB = prmSideB;
    this.attSideC = prmSideC;
  }

  // endregion
  // region Getters and Setters

  /**
   * Returns the base length of the triangle.
   *
   * @return base length
   */
  public double getAttBase() {
    return attBase;
  }

  /**
   * Returns the height of the triangle.
   *
   * @return height
   */
  public double getAttHeight() {
    return attHeight;
  }

  /**
   * Returns the length of side A.
   *
   * @return side A length
   */
  public double getAttSideA() {
    return attSideA;
  }

  /**
   * Returns the length of side B.
   *
   * @return side B length
   */
  public double getAttSideB() {
    return attSideB;
  }

  /**
   * Returns the length of side C.
   *
   * @return side C length
   */
  public double getAttSideC() {
    return attSideC;
  }

  /**
   * Updates the base length of the triangle.
   *
   * @param prmNewBase new base length
   */
  public void setAttBase(double prmNewBase) {
    this.attBase = prmNewBase;
  }

  /**
   * Updates the height of the triangle.
   *
   * @param prmNewHeight new height
   */
  public void setAttHeight(double prmNewHeight) {
    this.attHeight = prmNewHeight;
  }

  /**
   * Updates the length of side A.
   *
   * @param prmNewSideA new side A length
   */
  public void setAttSideA(double prmNewSideA) {
    this.attSideA = prmNewSideA;
  }

  /**
   * Updates the length of side B.
   *
   * @param prmNewSideB new side B length
   */
  public void setAttSideB(double prmNewSideB) {
    this.attSideB = prmNewSideB;
  }

  /**
   * Updates the length of side C.
   *
   * @param prmNewSideC new side C length
   */
  public void setAttSideC(double prmNewSideC) {
    this.attSideC = prmNewSideC;
  }

  // endregion
  // region Legacy Operations

  /**
   * Calculates the area of the triangle.
   * <p>
   * The result is rounded to one decimal place.
   * </p>
   *
   * @return area of the triangle
   */
  @Override
  public double opCalculateArea() {

    double varResult = (attBase * attHeight) / 2;

    return Math.round(varResult * 10.0) / 10.0;
  }

  /**
   * Calculates the perimeter of the triangle.
   * <p>
   * All three side lengths must be defined to perform this operation.
   * The result is rounded to one decimal place.
   * </p>
   *
   * @return perimeter of the triangle
   * @throws IllegalStateException if any side length is not defined
   */
  @Override
  public double opCalculatePerimeter() {

    if (attSideA == 0.0 || attSideB == 0.0 || attSideC == 0.0) {
      throw new IllegalStateException(
          "It is not possible to perform this operation without the side values");
    }

    double varResult = attSideA + attSideB + attSideC;

    return Math.round(varResult * 10.0) / 10.0;
  }

  // endregion

  // endregion
}
