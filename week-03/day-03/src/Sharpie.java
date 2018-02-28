public class Sharpie {
  private String color;
  private float width;
  private float inkAmount = 100;


  public Sharpie(String colorr, Float widthh) {
    color = colorr;
    width = widthh;
  }

  public void use() {
    inkAmount--;

  }

  public String toString(){
    return "Color: " + color + "\nAmount of ink: "+ inkAmount;

  }

}
