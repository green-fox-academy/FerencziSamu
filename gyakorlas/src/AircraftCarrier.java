import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  private int storeOfAmmo;
  private int hp;
  private List<Aircraft> list = new ArrayList<>();

  AircraftCarrier(int healthPoint, int initialAmmo) {
    storeOfAmmo = initialAmmo;
    hp = healthPoint;
  }

  public void add(Aircraft aircraft) {
    list.add(aircraft);
  }

  public void fill() {
    if (storeOfAmmo == 0) {
      System.out.println("There is no ammo!");
      return;
    }
    int totalNeedAmmo = calculateNeededAmmo();
    if (storeOfAmmo < totalNeedAmmo){
      fillPriority();
    }
  }

  private void fillPriority() {
    for (int i = 0; i < list.size(); i++) {
      if(list.get(i).isPriority()){
        
      }
    }
  }

  private int calculateNeededAmmo() {
    int totalAmmoNeeded = 0;
    for (int i = 0; i < list.size(); i++) {
      totalAmmoNeeded += list.get(i).getNeededAmmo();
    }
    return totalAmmoNeeded;
  }
}


