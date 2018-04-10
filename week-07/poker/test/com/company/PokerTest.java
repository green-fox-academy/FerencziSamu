package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class PokerTest {
  Poker poker = new Poker();

  @Test(expected = RuntimeException.class)
  public void getTheExceptionIf_blackPlayerHasZeroCard() {
    List<Card> black = new ArrayList();
    int size = 5;
    //Act
    int winner = poker.checksSizeOfBlack(black);
    //Assert
  }

  @Test
  public void converterTest() {
    Card card = new Card("J","D");
    int value = card.converter(card.getValueBeforeConversion());
    assertEquals(11,value);
  }

  @Test
  public void tellsWhoHasTheHigherTest(){
    List<Card> black = new ArrayList();
    List<Card> white = new ArrayList();
    poker.tellsWhiteSHigher();

  }

}