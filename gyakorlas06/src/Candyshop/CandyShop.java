package Candyshop;

import java.util.ArrayList;


public class CandyShop {
  ArrayList<Candy> shop = new ArrayList<>();
  private int gramsOfSugar;
  public static final Lollipop LOLLIPOP = new Lollipop();
  public static final Candy CANDY = new Candy();

  public CandyShop(int gramsOfSugar) {
    this.gramsOfSugar = gramsOfSugar;
  }

  public void createSweets(Candy candy) {
    shop.add(candy);
  }

  public void createSweets(Lollipop lollipop) {

  }
}
