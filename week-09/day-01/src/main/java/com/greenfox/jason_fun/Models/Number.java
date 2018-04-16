package com.greenfox.jason_fun.Models;

import org.springframework.stereotype.Component;

@Component
public class Number {
  private Integer received;
  private Integer result;

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
