package TheGardenApplication;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    Trees tree1 = new Trees("purple");
    Trees tree2 = new Trees("orange");
    Flowers flower1 = new Flowers("yellow");
    Flowers flower2 = new Flowers("blue");
    garden.add(tree1);
    garden.add(tree2);
    garden.add(flower1);
    garden.add(flower2);
    garden.isItFlowerOrTree();
    garden.checkWaterLevel();
    garden.watering(40);
    //watering print here
    System.out.println(flower1.getColor());
    System.out.println(flower2.getColor());
    System.out.println(tree1.getColor());
    System.out.println(tree2.getColor());
    //System.out.println(garden.toString());
    // forloop a listával, if else statement,kiiratom,hogy meg kell-e öntöznöm vagy nem.
  }
}
