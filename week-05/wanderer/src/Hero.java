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
      checkPos(oldX,oldY);
      setSkin("hero-up.png");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      goDown(map);
      checkPos(oldX,oldY);
      setSkin("hero-down.png");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      turnLeft(map);
      checkPos(oldX,oldY);
      setSkin("hero-left.png");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      turnRight(map);
      checkPos(oldX,oldY);
      setSkin("hero-right.png");
    }
  }
  public void checkPos(int oldX, int oldY) {
    if (oldX != posX || oldY != posY) {
      moveCounter++;
    }
  }

  public int getMoveCounter() {
    return moveCounter;
  }

  public void setMoveCounter(int moveCounter) {
    this.moveCounter = moveCounter;
  }
}

