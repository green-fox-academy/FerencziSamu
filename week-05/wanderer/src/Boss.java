import java.util.Random;

public class Boss extends Character {
  public Boss() {
    Random random = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    int n = random.nextInt(6) + 3;
    int m = random2.nextInt(10);
    int u = random3.nextInt(10);
    setLevel(1);
    setHealthPoint(2 * getLevel() * n + n);
    setDefense((getLevel() / 2) * n + (n / 2));
    setDamage(getLevel() * n + getLevel());
    setSkin("boss.png");
    setDead(false);
    setPosX(getSIZE() * u);
    setPosY(getSIZE() * m);

  }

  public void move(Map map) {
    Random random = new Random();
    int o = random.nextInt(4) + 1; // egytől négyig megy. MAGYAR IGEN!
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