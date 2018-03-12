public class Aircraft {
  private int currentAmmo;
  private int baseDamage;
  private int maxAmmo;
  private String type;

  Aircraft(int baseDamage, int maxAmmo, String type) {
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
    this.type = type;
    currentAmmo = 0;
  }

  public int fight() {
    int damage = baseDamage * currentAmmo;
    currentAmmo = 0;
    return damage;
  }

  public int refill(int ammoStore) {
    int neededAmmo = maxAmmo - currentAmmo;
    if (ammoStore >= neededAmmo) {
      currentAmmo = maxAmmo;
      ammoStore -= neededAmmo;
    } else {
      currentAmmo += ammoStore;
      ammoStore = 0;
    }
    return ammoStore;
  }

  public int getNeededAmmo() {
    return maxAmmo - currentAmmo;
  }

  public String getType() {
    return type;
  }

  public int getDamage() {
    return baseDamage * currentAmmo;
  }

  public void getStatus() {
    System.out.println("Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage
        + ", All Damage: " + getDamage());
  }

  public boolean isPriority() {
    return type.equals("F35");
  }
}
