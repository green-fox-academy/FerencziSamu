public class Counter {

  private int startValue;
  private int fieldValue;

  public Counter(){

    this.startValue = 0;
    this.fieldValue = 0;

  }

  public Counter(int fieldValue){
    this.startValue = fieldValue;
    this.fieldValue = fieldValue;

  }
  public void add() {
    startValue++;

  }

  public void add(int number) {
    startValue = startValue + number;

  }

  public int get() {
    System.out.println(startValue);
    return startValue;

  }

  public void reset() {
    this.startValue = fieldValue;

  }


}
