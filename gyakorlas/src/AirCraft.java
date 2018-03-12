public class AirCraft {
  private int currentAmmo;
  private int baseDamage;
  private int maxAmmo;
  private String type;

  AirCraft(int baseDamage,int maxAmmo,String type){
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
    this.type = type;
    currentAmmo = 0;

  }
}
