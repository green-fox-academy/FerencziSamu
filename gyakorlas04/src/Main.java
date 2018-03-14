public class Main {
  public static void main(String[] args) {
    Garden myLittleSweetGardenOfTheYear = new Garden();

    Plant firstTree = new Tree("orange");
    Plant secondTree = new Tree("purple");
    Plant firstFlower= new Flower("yellow");
    Plant secondFlower= new Flower("blue");

    myLittleSweetGardenOfTheYear.addPlant(firstFlower);
    myLittleSweetGardenOfTheYear.addPlant(firstTree);
    myLittleSweetGardenOfTheYear.addPlant(secondFlower);
    myLittleSweetGardenOfTheYear.addPlant(secondTree);

    System.out.println(myLittleSweetGardenOfTheYear.getStatusOfGarden());

    myLittleSweetGardenOfTheYear.wateringPlants(40);

    System.out.println(myLittleSweetGardenOfTheYear.getStatusOfGarden());

    myLittleSweetGardenOfTheYear.wateringPlants(70);

    System.out.println(myLittleSweetGardenOfTheYear.getStatusOfGarden());

    myLittleSweetGardenOfTheYear.wateringPlants(1000);

    System.out.println(myLittleSweetGardenOfTheYear.getStatusOfGarden());
  }
}
