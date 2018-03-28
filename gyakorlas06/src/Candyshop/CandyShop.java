package candyshop;

import java.util.ArrayList;

public class CandyShop {
  ArrayList<Sweets> inventory;
  protected int amountOfSugar;
  protected int budget;
  protected int amountOfSoldLollipop;
  protected int amountOfSoldCandy;
  public static final Lollipop LOLLIPOP = new Lollipop();
  public static final Candy CANDY = new Candy();

  public CandyShop(int gramsOfSugar) {
    this.amountOfSugar = gramsOfSugar;
    inventory = new ArrayList<>();
    budget = 0;
  }

  public void createSweets(Candy candy) {
    inventory.add(candy);
    amountOfSugar -= candy.sugar;
  }

  public void createSweets(Lollipop lollipop) {
    inventory.add(lollipop);
    amountOfSugar -= lollipop.sugar;
  }

  public void raise(int percentage) {
//    for (int j = 0; j < inventory.size(); j++) {
//      inventory.get(j).price = inventory.get(j).price * (100 + percentage) / 100;
//    }
    long raise = (100 + percentage) / 100;
    CANDY.price *= raise;
    LOLLIPOP.price *= raise;
  }

  public void sell(Candy CANDY, int amountOfSoldCandy) {
    int numberOfTimesCandy = 0;
    this.amountOfSoldCandy = amountOfSoldCandy;
    while (numberOfTimesCandy != amountOfSoldCandy) {
      for (int j = 0; j < inventory.size(); j++) {
        if (inventory.get(j) == CANDY)
          inventory.remove(j);
        budget += inventory.get(j).price;
      }
      numberOfTimesCandy++;
    }
  }

  public void sell(Lollipop LOLLIPOP, int amountOfSoldLollipop) {
    int numberOfTimesLollipop = 0;
    this.amountOfSoldLollipop = amountOfSoldLollipop;
    while (numberOfTimesLollipop != amountOfSoldLollipop) {
      for (int j = 0; j < inventory.size(); j++) {
        if (inventory.get(j) == LOLLIPOP)
          inventory.remove(j);
        budget += inventory.get(j).price;
      }
      numberOfTimesLollipop++;
    }
  }

  public int countIncome() {
    int number = 0;
    return number = (amountOfSoldCandy * CANDY.price) + (amountOfSoldLollipop * LOLLIPOP.price);
  }

  public void buySugar(int priceOfSugar) {
    budget -= priceOfSugar / 10;
    amountOfSugar += priceOfSugar;
  }

  public int numberOfCandies() {
    int number = 0;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i) == CANDY) {
        number++;
      }
    }
    return number;
  }

  public int numberOfLollipop() {
    int number = 0;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i) == LOLLIPOP)
        number++;
    }
    return number;
  }

  @Override  // // Invetory: 2 candies, 2 lollipops, Income: 0$, Sugar: 270gr
  public String toString() {
    return "Inventory: " + numberOfCandies() + " candies, " + numberOfLollipop() + " lollipops, " +
        "Income: " + countIncome() + "$," + " Sugar: " + amountOfSugar + "gr";
  }
}