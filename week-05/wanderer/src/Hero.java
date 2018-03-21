import java.util.Random;

public class Hero extends Character {

  public Hero() {
    Random random = new Random();
    int n = random.nextInt(6) + 3;
    setHealthPoint(20 + 3 * n);
    setDefense(2 * n);
    setDamage(5 + n);
    setDead(false);
    setSkin("hero-down.png");
  }

  public void turnRight(Map map) {
    setSkin("hero-right.png");
    int newX = posX + getSIZE();
    int newY = posY;
    if (map.getMazeIndex(newX,newY) == 0) {
      posX = newX;
      posY = newY;
    }

  }

  public void turnLeft(Map map) {
    setSkin("hero-left.png");
    int newX = posX - getSIZE();
    int newY = posY;
    if (map.getMazeIndex(newX, newY) == 0) {
      posX = newX;
      posY = newY;
    }
  }

  public void goUp(Map map) {
    setSkin("hero-up.png");
    int newX = posX;
    int newY = posY - getSIZE();
    if (map.getMazeIndex(newX, newY) == 0) {
      posX = newX;
      posY = newY;
    }
  }

  public void goDown(Map map) {
    setSkin("hero-down.png");
    int newX = posX;
    int newY = posY + getSIZE();
    if (map.getMazeIndex(newX,newY) == 0) {
      posX = newX;
      posY = newY;
    }
  }

}

