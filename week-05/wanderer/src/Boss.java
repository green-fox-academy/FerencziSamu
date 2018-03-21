import java.util.Random;

public class Boss extends Character {
  public Boss() {
    Random random = new Random();
    int n = random.nextInt(6) + 3;
    setLevel(1);
    setHealthPoint(2 * getLevel() * n + n);
    setDefense((getLevel() / 2) * n + (n / 2));
    setDamage(getLevel() * n + getLevel());
  }
}