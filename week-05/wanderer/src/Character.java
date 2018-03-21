public class Character extends PositionedImage {
  private int healthPoint;
  private int damage;
  private int defense;
  private int level;
  private String skin;
  private boolean isDead;
  private int SIZE = 72;

  public Character() {

  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getSkin() {
    return skin;
  }

  public void setSkin(String skin) {
    this.skin = skin;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  public int getSIZE() {
    return SIZE;
  }
}

