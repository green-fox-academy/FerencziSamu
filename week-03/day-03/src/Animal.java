public class Animal {
  private int hunger = 50;
  private int thirst = 50;


  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public String toString() {
    return "Hunger: " + hunger + "\nThirst: " + thirst;
  }
}
