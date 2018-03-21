import java.util.Random;

public class Skeleton extends Character {
  public Skeleton() {
    Random random = new Random();
    Random random2 = new Random();
    int n = random.nextInt(6) + 3;
    int m = random2.nextInt(10) + 0;
    setLevel(1);
    setHealthPoint(2 * getLevel() * n);
    setDefense((getLevel() / 2) * n);
    setDamage(getLevel() * n);
    setSkin("skeleton.png");
    setDead(false);
    setPosX(getSIZE() * m);
    setPosY(getSIZE() * m);
  }
}
