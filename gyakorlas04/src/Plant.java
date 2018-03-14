public class Plant {
  protected String colour;
  protected int amountOfWater;
  protected String type;
  protected boolean needsWater;

  public Plant() {
  }

  public Plant(String colour) {
    this.colour = colour;
    this.needsWater = true;
  }
  public String getStatus(){
    return "The " + colour + " " + type + printThurst();
  }

  private String printThurst() {
    if (needsWater) {
      return " needs water";
    } else {
      return " does not need water";
    }
  }
}
