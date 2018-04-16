package com.greenfox.jason_not_fun.Models;


public class Hiba {

  private String error;

  public Hiba () {
  }

  public Hiba (String error) {
    this();
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
