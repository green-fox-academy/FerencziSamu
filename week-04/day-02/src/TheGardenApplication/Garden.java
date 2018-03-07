package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plants> plants;
  int countThirsty = 0;
  Garden() {
    this.plants = new ArrayList<>();
  }

  public void isItFlowerOrTree() {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i) instanceof Trees) {
        plants.get(i).setPlantsType(true);
      } else {
        plants.get(i).setPlantsType(false);
      }
    }
  }

  public void add(Plants plants) {
    this.plants.add(plants);
  }

  public void checkWaterLevel() {

    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).isTree()) {
        if (plants.get(i).getWaterLevel() < 10) {
          plants.get(i).setThursty(true);
          countThirsty++;
        } else {
          plants.get(i).setThursty(false);
        }
      } else {
        if (plants.get(i).getWaterLevel() < 5) {
          plants.get(i).setThursty(true);
          countThirsty++;
        } else {
          plants.get(i).setThursty(false);
        }
      }
    }
  }

  public void watering(double amountOfWater) {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).isTree()) {
        if (plants.get(i).isThursty()) {
          plants.get(i).setWaterLevel((int) (plants.get(i).getWaterLevel() + calculate(amountOfWater)));
        }
        System.out.println("Watering with " + amountOfWater);
      }
    }
  }

  private double calculate(double amountOfWater) {
    return amountOfWater / countThirsty;
  }
  public void status(){
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).isThursty() == true){
        System.out.println(plants.get(i) + "is thirsty!");
      }else {
        System.out.println(plants.get(i) + "is not thirsty!");
      }
    }
  }
}




