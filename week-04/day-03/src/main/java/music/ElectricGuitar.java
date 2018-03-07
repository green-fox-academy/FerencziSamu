package main.java.music;

public class ElectricGuitar extends StringedInstruments {
  public ElectricGuitar() {
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }
}