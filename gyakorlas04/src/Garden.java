import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> list1 = new ArrayList<>();

  public Garden() {

  }

  public void addPlant(Plant plant) {
    list1.add(plant);
  }

  public int countThirstyPlants() {
    int counter = 0;
    for (int i = 0; i < list1.size(); i++) {
      if (list1.get(i).needsWater) {
        counter += 1;
      }
    }
    return counter;
  }

  public void wateringPlants(int waterAmount) {
    System.out.println("Watering with: " + waterAmount);
    for (int i = 0; i < list1.size(); i++) {
      if (list1.get(i).needsWater) {
        if (list1.get(i).type.equals("Tree")) {
          double absorptionRate = 0.40;
          list1.get(i).amountOfWater += (waterAmount / countThirstyPlants()) * absorptionRate;
        } else {
          double abs = 0.75;
          list1.get(i).amountOfWater += (waterAmount / countThirstyPlants()) * abs;
        }
      }
    }
    checkAndSetThirstOfWater();
  }

  public void checkAndSetThirstOfWater() {
    for (int i = 0; i < list1.size(); i++) {
      if (list1.get(i).type.equals("Tree") && list1.get(i).amountOfWater > 10) {
        list1.get(i).needsWater = false;
      } else if
          (list1.get(i).type.equals("Flower") && list1.get(i).amountOfWater > 5) {
        list1.get(i).needsWater = false;
      }
    }
  }

  public String getStatusOfGarden(){
    String status = "";
    for (int i = 0; i < list1.size(); i++) {
      status += list1.get(i).getStatus()+ "\n";
    } return status;
  }
}



