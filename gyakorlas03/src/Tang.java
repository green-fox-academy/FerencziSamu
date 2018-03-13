public class Tang extends Fish {
  private boolean memoryLoss;
  public Tang(String name, int weight, String colour,boolean memoryLoss) {
    super(name,weight,colour);
    this.memoryLoss = memoryLoss;
  }

  @Override
  public String getStatus() {
    return super.getStatus() + ", short-term memory loss: " + memoryLoss;
  }
}
