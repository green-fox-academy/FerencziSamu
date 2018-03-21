import java.util.Random;

public class Boss extends Character {
  public Boss() {
    Random random = new Random();
    Random random2 = new Random();
    int n = random.nextInt(6) + 3;
    int m = random2.nextInt(10) + 0;
    setLevel(1);
    setHealthPoint(2 * getLevel() * n + n);
    setDefense((getLevel() / 2) * n + (n / 2));
    setDamage(getLevel() * n + getLevel());
    setSkin("boss.png");
    setDead(false);
    setPosX(getSIZE() * m);
    setPosY(getSIZE() * m);

  }
}