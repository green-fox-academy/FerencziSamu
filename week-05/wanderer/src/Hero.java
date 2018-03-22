import java.awt.event.KeyEvent;
import java.util.Random;

public class Hero extends Character {
  private int moveCounter;

  public Hero() {
    Random random = new Random();
    int n = random.nextInt(6) + 3;
    setHealthPoint(20 + 3 * n);
    setDefense(2 * n);
    setDamage(5 + n);
    setDead(false);
    setSkin("hero-down.png");
  }

  public void move(KeyEvent e, Map map) {
    int oldX = posX;
    int oldY = posY;
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      goUp(map);
      if (checkPos(oldX, oldY)) {
        moveCounter++;
      }
      setSkin("hero-up.png");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      goDown(map);
      if (checkPos(oldX, oldY)) {
        moveCounter++;
      }
      setSkin("hero-down.png");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      turnLeft(map);
      if (checkPos(oldX, oldY)) {
        moveCounter++;
      }
      setSkin("hero-left.png");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      turnRight(map);
      if (checkPos(oldX, oldY)) {
        moveCounter++;
      }
      setSkin("hero-right.png");
    }
  }


  public int getMoveCounter() {
    return moveCounter;
  }

  public void setMoveCounter(int moveCounter) {
    this.moveCounter = moveCounter;
  }
}

