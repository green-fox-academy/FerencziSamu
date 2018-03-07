package CharSequence;

public class Shifter implements CharSequence {
  String field2;
  int shiftNumber;

  public Shifter(String field, int shiftNumber) {
    this.field2 = field;
    this.shiftNumber = shiftNumber;
  }

  @Override
  public int length() {
    return field2.length();
  }

  @Override
  public char charAt(int index) {
    return field2.charAt(index + shiftNumber);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return field2.subSequence(start + shiftNumber,end + shiftNumber);
  }
}