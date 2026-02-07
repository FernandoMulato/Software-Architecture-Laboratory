package com.fernandomulato.model;

public class ClsTriangle {

  private float attBase;
  private float attHeight;

  public ClsTriangle(float prmBase, float prmHeight) {
    this.attBase = prmBase;
    this.attHeight = prmHeight;
  }

  public float getAttBase() {
    return attBase;
  }

  public float getAttHeight() {
    return attHeight;
  }

  public void setAttBase(float prmNewBase) {
    this.attBase = prmNewBase;
  }

  public void setAttHeight(float prmNewHeight) {
    this.attHeight = prmNewHeight;
  }
}
