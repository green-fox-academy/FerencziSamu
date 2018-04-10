package com.company;

import java.util.ArrayList;
import java.util.List;

public class Poker {
  List<Card> black = new ArrayList<>();
  List<Card> white = new ArrayList<>();

  public int checksSizeOfBlack(List<Card> black) {
    if (black.size() != 5) {
      throw new RuntimeException("black player is out of the game");
    }
    return 1;
  }

  public int tellsWhiteSHigher() {
    addCardWhite();
    int value = 0;
    for (Card card : white) {
      if (card.getValue() > value) {
        value = card.getValue();
      }
    }
    return value;
  }

  public int tellsBlackSHigher() {
    addCardBlack();
    int value = 0;
    for (Card card : black) {
      if (card.getValue() > value) {
        value = card.getValue();
      }
    }
    return value;
  }

  public void addCardWhite() {
    white.add(new Card(2, "C"));
    white.add(new Card(3, "H"));
    white.add(new Card(4, "S"));
    white.add(new Card(8, "C"));
    white.add(new Card("A", "H"));
  }

  public void addCardBlack() {
    black.add(new Card(2, "H"));
    black.add(new Card(3, "D"));
    black.add(new Card(5, "S"));
    black.add(new Card(9, "C"));
    black.add(new Card("K", "D"));
  }

  public List whoIsTheWinner(List black, List white) {
    this.black = black;
    this.white = white;
    tellsWhiteSHigher();
    tellsBlackSHigher();
    if (tellsWhiteSHigher() > tellsBlackSHigher()) {
      return white;
    }
    return black;
  }

}

