import java.util.ArrayList;
import java.util.List;
// There are 3 kind of fishes:
// - Clownfish, gains 1 gramm when feeded and has stripe color.
// - Tang, gains 1 gramms when feeded and can suffer short-term memory loss.
// - Koi, gains 2 gramms when feeded.
// Each fish has a name, weight, color and has a status and feed method.

// Create an aquarium and take care of your fishes.
// Create a method on the aquarium that feeds all the fishes in the aquarium:
// increases the weight of every fish with the amount of gramms they gain when feeded.
// Create a method on the aquarium that removes the big fishes.
// A big fish's weight is at least 11 gramms.
// The aquarium has a status method it should print the status for each fish.

public class Aquarium {
  List<Fish> list = new ArrayList<>();

  public void feedTheFishes(){
    for (int i = 0; i < list.size(); i++) {
      list.get(i).feed();
    }
  }
  public String getStatusAq(){
    String status = "";
    for (int i = 0; i < list.size(); i++) {
     status += list.get(i).getStatus()+ "\n";
    } return status;
  }
  public void addFish(Fish fish){
    list.add(fish);
  }
}
