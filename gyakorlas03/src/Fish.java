// Each fish has a name, weight, color and has a status and feed method.
public class Fish {
  private String name;
  private int weight;
  private String colour;

  public String getStatus() {
    return name + ", weight: " + weight + ", colour: " + colour;
  }

  public void feed() {

  }

  public Fish() {

  }

  public Fish(String name, int weight, String colour) {
    this.name = name;
    this.weight = weight;
    this.colour = colour;
  }
}
