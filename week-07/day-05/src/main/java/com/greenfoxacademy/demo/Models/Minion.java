package com.greenfoxacademy.demo.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Minion {
  private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(1);
  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;
  private Integer id;

  public Minion() {

  }

  public Minion(String name) {
    this.name = name;
    listOfTricks = new ArrayList<>();
    this.id = ATOMIC_INTEGER.getAndIncrement();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
