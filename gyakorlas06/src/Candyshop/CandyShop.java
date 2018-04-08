package candyshop;

import java.util.ArrayList;

public class CandyShop {
  ArrayList<Sweets> inventory;
  protected int budget;
  protected int amountOfSugar;
  //  protected int amountOfSoldLollipop;
  //  protected int amountOfSoldCandy;
  protected int amountOfSold;
  Lollipop LOLLIPOP = new Lollipop();
  public static final Candy CANDY = new Candy();

  public CandyShop(int gramsOfSugar) {
    this.amountOfSugar = gramsOfSugar;
    inventory = new ArrayList<>();
    budget = 0;
  }

  public void createSweets(Sweets sweets) {
    inventory.add(sweets);
    amountOfSugar -= sweets.sugar;
    LOLLIPOP.
  }

//  public void createSweets() {
//    inventory.add(lollipop);
//    amountOfSugar -= lollipop.sugar;
//  }

  public void raise(int percentage) {
//    for (int j = 0; j < inventory.size(); j++) {
//      inventory.get(j).price = inventory.get(j).price * (100 + percentage) / 100;
//    }
    double raise = (100 + percentage) / 100;
    CANDY.price *= raise;
    LOLLIPOP.price *= raise;
  }

//  public void sell(Candy CANDY, int amountOfSoldCandy) {
//    int numberOfTimesCandy = 0;
//    this.amountOfSoldCandy = amountOfSoldCandy;
//    while (numberOfTimesCandy != amountOfSoldCandy) {
//      for (int j = 0; j < inventory.size(); j++) {
//        if (inventory.get(j) == CANDY)
//          inventory.remove(j);
//        budget += inventory.get(j).price;
//      }
//      numberOfTimesCandy++;
//    }
//  }

  public void sell(Sweets sweets, int amountOfSold) {
    int number = 0;
    this.amountOfSold = amountOfSold;
    while (number != amountOfSold) {
      for (int i = 0; i < inventory.size(); i++) {
        if (inventory.get(i).type.equals("Candy")) {
          inventory.remove(i);
          budget += inventory.get(i).price;
          number = amountOfSold;
        } else {
          inventory.remove(i);
          budget += inventory.get(i).price;
          number = amountOfSold;
        }
      }
    }
    amountOfSold++;
  }

//  public void sell(Lollipop LOLLIPOP, int amountOfSoldLollipop) {
//    int numberOfTimesLollipop = 0;
//    this.amountOfSoldLollipop = amountOfSoldLollipop;
//    while (numberOfTimesLollipop != amountOfSoldLollipop) {
//      for (int j = 0; j < inventory.size(); j++) {
//        if (inventory.get(j) == LOLLIPOP)
//          inventory.remove(j);
//        budget += inventory.get(j).price;
//      }
//      numberOfTimesLollipop++;
//    }
//  }

  public int countIncome() {
    int number = 0;
    return number = (amountOfSold * CANDY.price) + (amountOfSold * LOLLIPOP.price);
  }

  public void buySugar(int priceOfSugar) {
    budget -= priceOfSugar / 10;
    amountOfSugar += priceOfSugar;
  }

  public int numberOfCandies() {
    int number = 0;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i).type.equals("Candy")) {
        number++;
      }
    }
    return number;
  }

  public int numberOfLollipop() {
    int number = 0;
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i).type.equals("Lollipop")) {
        number++;
      }
    }
    return number;
  }

  @Override  // // Invetory: 2 candies, 2 lollipops, Income: 0$, Sugar: 270gr
  public String toString() {
    return "Inventory: " + numberOfCandies() + " candies, " + numberOfLollipop() + " lollipops, " +
        "Income: " + countIncome() + "$," + " Sugar: " + amountOfSugar + "gr";
  }
}