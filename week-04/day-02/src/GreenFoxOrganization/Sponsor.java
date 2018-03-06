package GreenFoxOrganization;

public class Sponsor extends Person {

  private String company = "Google";
  private int hiredStudents = 0;

  Sponsor(){
    super();
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who " +
            "represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}