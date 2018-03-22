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

  public void turnRight(Map map) {
    int newX = posX + getSIZE();
    int newY = posY;
    if (newX < 720 && map.getMazeIndex(newX, newY) == 0) {
      posX = newX;
      posY = newY;
    }
  }

  public void turnLeft(Map map) {
    int newX = posX - getSIZE();
    int newY = posY;
    if (newX >= 0 && map.getMazeIndex(newX, newY) == 0) {
      posX = newX;
      posY = newY;
    }
  }

  public void goUp(Map map) {
    int newX = posX;
    int newY = posY - getSIZE();
    if (newY >= 0 && map.getMazeIndex(newX, newY) == 0) {
      posX = newX;
      posY = newY;
    }
  }

  public void goDown(Map map) {
    int newX = posX;
    int newY = posY + getSIZE();
    if (newY < 720 && map.getMazeIndex(newX, newY) == 0) {
      posX = newX;
      posY = newY;
    }
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

  public boolean checkPos(int oldX, int oldY) {
    if (oldX != posX || oldY != posY) {
      return true;
    }
    return false;
  }
}

