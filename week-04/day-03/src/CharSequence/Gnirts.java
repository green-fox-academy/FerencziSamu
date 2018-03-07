package CharSequence;

public class Gnirts implements CharSequence {
  private String field;

  public Gnirts(String field) {
    this.field = field;
  }


  @Override
  public int length() {
    return field.length();
  }

  @Override
  public char charAt(int index) {
    return field.charAt(field.length() - index -1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return field.subSequence(field.length()-start,field.length()-end);
  }

}