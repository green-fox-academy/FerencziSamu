import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  private int storeOfAmmo;
  private int hp;
  private List<Aircraft> list = new ArrayList<>();
  private int allDamage;

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
    if (storeOfAmmo < totalNeedAmmo) {
      fillPriority();
    } else {
      for (int i = 0; i < list.size(); i++) {
        int ammo = 50;
        list.get(i).refill(ammo);
        storeOfAmmo -= ammo;
      }
    }
  }

  private void fillPriority() {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).isPriority()) {
        int ammo = 50;
        list.get(i).refill(ammo);
        storeOfAmmo -= ammo;
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

  public void fight(AircraftCarrier aircraftCarrier) {
    aircraftCarrier.hp = aircraftCarrier.hp - this.getAllDamage();
  }

  public int getAllDamage() {
    int allDamage = 0;
    for (int i = 0; i < list.size(); i++) {
      allDamage += list.get(i).getDamage();
    }
    return allDamage;
  }

  public String getStatus(){
    String status = "HP: " + hp+ ", Aircraft count: " + list.size() + ", Ammo " +
        "Storage: " + storeOfAmmo + ", Total damage: " + getAllDamage() +"\n" +
        "Aircrafts: \n";
    for (int i = 0; i < list.size(); i++) {
      status += list.get(i).getStatus()+ "\n";
    }
    return status;
  }
}


