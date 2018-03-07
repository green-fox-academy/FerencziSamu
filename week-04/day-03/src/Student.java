public class Student extends Person implements Cloneable {

  private String previousOrganization = "The School of Life";
  private int skippedDays = 0;

  Student(){
    super();
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " +
            previousOrganization + " who skipped " + skippedDays + " days from the course already");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
  protected Object clone()throws CloneNotSupportedException{
    return super.clone();
  }
}