import java.util.Random;

public class Hero extends Character {
  private int SIZE = 72;
  public Hero() {
    Random random = new Random();
    int n = random.nextInt(6) + 3;
    setHealthPoint(20 + 3 * n);
    setDefense(2 * n);
    setDamage(5 + n);
    setDead(false);
    setSkin("hero-down.png");
  }

  public void turnRight() {
    setSkin("hero-right.png");
    posX += SIZE;

  }

  public void turnLeft(Map map) {
    setSkin("hero-left.png");
    int newX = posX - SIZE;
    int newY = posY;

    if (canMoveHere(newX, newY, map)) {
      posX = newX;
      posY = newY;
    }
  }

  private boolean canMoveHere(int newX, int newY, Map map) {

    return false;
  }

  public void goUp() {
    setSkin("hero-up.png");
    posY -= SIZE;
  }

  public void goDown() {
    setSkin("hero-down.png");
    posY += SIZE;
  }

}

