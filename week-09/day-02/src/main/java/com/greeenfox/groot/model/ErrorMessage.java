package com.greeenfox.groot.model;

public class ErrorMessage {
  private String error;

  public ErrorMessage() {

  }

  public ErrorMessage(String error) {
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
