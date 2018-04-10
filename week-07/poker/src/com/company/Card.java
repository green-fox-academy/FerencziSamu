package com.company;

public class Card {
  private String suit;
  private int value;
  private String valueBeforeConversion;

  public Card(String valueBeforeConversion, String suit) {
    converter(valueBeforeConversion);
    this.suit = suit;
  }

  public int converter(String valueBeforeConversion) {
    this.valueBeforeConversion = valueBeforeConversion;
    if (valueBeforeConversion.equals("J")) {
      return 11;
    } else if (valueBeforeConversion.equals("Q")) {
      return 12;
    } else if (valueBeforeConversion.equals("K")) {
      return 13;
    } else if (valueBeforeConversion.equals("A")) {
      return 14;
    } return 0;
  }

  public Card(int value, String suit) {
    this.value = value;
    this.suit = suit;
  }

  public String getValueBeforeConversion() {
    return valueBeforeConversion;
  }

  public int getValue() {
    return value;
  }
}
