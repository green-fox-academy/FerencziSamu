package main.java.music;

public abstract class StringedInstruments extends Instrument {
  private int numberOfStrings;

  StringedInstruments(){

  }

  StringedInstruments(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }
  
  public void sound(){

  }

  @Override
  public void play() {


  }
}
