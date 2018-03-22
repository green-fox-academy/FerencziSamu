import java.util.Random;

public class Skeleton extends Character {
  public Skeleton() {
    Random random = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    int n = random.nextInt(6) + 3;
    int m = random2.nextInt(10);
    int u = random3.nextInt(10);
    setLevel(1);
    setHealthPoint(2 * getLevel() * n);
    setDefense((getLevel() / 2) * n);
    setDamage(getLevel() * n);
    setSkin("skeleton.png");
    setDead(false);
    setPosX(getSIZE() * m);
    setPosY(getSIZE() * u);
  }

  public void move(Map map) {
    Random random = new Random();
    int oldX = posX;
    int oldY = posY;
    while (!checkPos(oldX,oldY)) {
      int o = random.nextInt(4) + 1;
      if (o == 1) {
        turnLeft(map);
      } else if (o == 2) {
        turnRight(map);
      } else if (o == 3) {
        goDown(map);
      } else {
        goUp(map);
      }
    }
  }
}
