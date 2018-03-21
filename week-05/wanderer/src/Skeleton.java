import java.util.Random;

public class Skeleton extends Character {
  public Skeleton() {
    Random random = new Random();
    int n = random.nextInt(6) + 3;
    setLevel(1);
    setHealthPoint(2 * getLevel() * n);
    setDefense((getLevel() / 2) * n);
    setDamage(getLevel() * n);
  }
}
