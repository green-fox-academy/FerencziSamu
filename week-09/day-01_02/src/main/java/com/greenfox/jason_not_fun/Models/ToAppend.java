package com.greenfox.jason_not_fun.Models;

public class ToAppend {

  private String appended;

  public ToAppend() {

  }

  public ToAppend(String name) {
    this();
    this.appended = name + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String name) {
    this.appended = name;
  }
}
