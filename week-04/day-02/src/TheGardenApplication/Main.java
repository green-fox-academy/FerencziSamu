package TheGardenApplication;

public class Main {
  public static void main(String[] args) {
    
    Trees tree1 = new Trees("purple");
    Trees tree2 = new Trees("orange");
    Flowers flower1 = new Flowers("yellow");
    Flowers flower2 = new Flowers("blue");
    System.out.println(tree1.getWaterLevel());
  }
}