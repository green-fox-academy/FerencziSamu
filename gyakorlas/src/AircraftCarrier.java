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

  public void add(Aircraft aircraft){
    list.add(aircraft);
  }

  public void fill(){
    if (storeOfAmmo == 0){
      System.out.println("There is no ammo!");
    } else if (storeOfAmmo ){

    }
  }

}
