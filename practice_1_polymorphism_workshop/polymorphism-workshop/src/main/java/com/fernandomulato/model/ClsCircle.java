package com.fernandomulato.model;

public class ClsCircle extends ClsFigure {

  private float attRadius;
  
  public ClsCircle(float prmRadius) {
    this.attRadius = prmRadius;
  }

  public float getAttRadius() {
    return this.attRadius;
  }

  public void setAttRadius(float prmNewRadius) {
    this.attRadius = prmNewRadius; 
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
