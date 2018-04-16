package com.greenfox.jason_not_fun.Models;

public class Szam {

  private Integer received;
  private Integer result;

  public Szam() {

  }

  public Szam(Integer received) {
    this();
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}