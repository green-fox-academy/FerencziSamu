public class Clownfish extends Fish {
  private String colour2;
  public Clownfish(String name, int weight, String colour, String colour2) {
    super(name, weight, colour);
    this.colour2 = colour2;
  }

  @Override
  public String getStatus() {
    return super.getStatus() + ", Stripe colour: " + colour2;
  }
}
