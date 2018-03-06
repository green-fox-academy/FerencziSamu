import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> listOfStudents;
  private List<Mentor> listOfMentors;

  public Cohort(String name) {
    this.name = name;
    this.listOfStudents = new ArrayList<>();
    this.listOfMentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.listOfStudents.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.listOfMentors.add(mentor);
  }
}