import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private int studentId;
    private List<String> courses;


    public void addCourse(String course) {
        this.courses.add(course);

    }

    public List<String> getCourses(){
        return courses;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, int age, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;

        this.courses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
