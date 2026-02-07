package com.fernandomulato.model;

public class ClsSquare extends ClsFigure {

  private float attSide;

  public ClsSquare(float prmSide) {
    this.attSide = prmSide;
  }

  public float getAttSide() {
    return this.attSide;
  }

  public void setAttSide(float prmNewSide) {
    this.attSide = prmNewSide;
  }

  @Override
  public double opCalculateArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'opCalculateArea'");
  }

  @Override
  public double opCalculatePerimeter() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'opCalculatePerimeter'");
  }

}
