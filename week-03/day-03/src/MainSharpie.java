public class MainSharpie {
  public static void main(String[] args) {
    Sharpie toll1 = new Sharpie("blue", (float) 4);

    toll1.use();
    toll1.use();

    System.out.println(toll1);
  }
}
