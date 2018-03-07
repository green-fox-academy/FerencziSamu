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

    //watering print here
    garden.status();
    garden.watering(40);
    garden.status();
    //System.out.println(garden.toString());
    // forloop a listával, if else statement,kiiratom,hogy meg kell-e öntöznöm vagy nem.
  }
}
