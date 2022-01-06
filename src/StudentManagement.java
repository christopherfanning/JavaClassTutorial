import java.util.*;

public class StudentManagement {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Map<Integer, String> dbMap = new HashMap<>();

        int numberOfStudents = 1;


        System.out.println("");

        Scanner s = new Scanner(System.in);
        System.out.print("How many students do you want to create? ");
        numberOfStudents = s.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("");
            s.nextLine();

            System.out.println("Student, Enter Your first name: ");
            String studentFirstName = s.nextLine();
            System.out.print("Student, Enter Your lastname name: ");
            String studentLastName = s.nextLine();
            System.out.print("Student, Enter Your age: ");
            int studentAge = s.nextInt();
            System.out.print("Student, Enter Your ID number: ");
            int studentId = s.nextInt();
            Student student = new Student(studentFirstName, studentLastName, studentAge, studentId);
            s.nextLine();
            System.out.println("Do you want to add a course? ");
            String answer = s.nextLine();
            if (answer.equals("yes") || answer.equals("y")){
                System.out.println("How many courses would you like to add?");
                int numOfCourses = s.nextInt();
                for(int j = 0; j < numOfCourses; j++)


                System.out.println("Which course? ");
                String course = s.nextLine();
                dbMap.put(studentId, course);
            }

            studentList.add(student);
        }


//        System.out.println("You typed " + studentFirstName);
//        System.out.println("and some number " + myint);


        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getFirstName());
            System.out.println(studentList.get(i).getLastName());
            System.out.println(studentList.get(i).getAge());
            System.out.println(studentList.get(i).getStudentId());

        }

        System.out.println("These are the courses:");
        System.out.println(dbMap.toString());

//        Student kevin = new Student();
//        kevin.firstName = "Kevin";
//        kevin.lastName = "Brown";
//
//        kevin.studentId = 1;
//        kevin.age = 20;
//
//        System.out.println(kevin.firstName);
//        System.out.println(kevin.lastName);
//        System.out.println(kevin.studentId);
//        System.out.println(kevin.age);

//        kevin.setFirstName("Kevin");
//        kevin.setLastName("Brown");
//
//        kevin.setStudentId(1);
//        kevin.setAge(20);
//
//        System.out.println(kevin.getFirstName());
//        System.out.println(kevin.getLastName());
//        System.out.println(kevin.getStudentId());
//        System.out.println(kevin.getAge());
//
//        Student simion = new Student();
//        simion.firstName = "Simion";
//        simion.lastName = "Jardin";
//        simion.studentId = 2;
//        simion.age = 28;
//
//        System.out.println(simion.firstName);
//        System.out.println(simion.lastName);
//        System.out.println(simion.studentId);
//        System.out.println(simion.age);
//

//        studentList.add(kevin);
//        studentList.add(simion);
//
//        for (int i = 0; i < studentList.size(); i++) {
//            System.out.println(studentList.get(i).firstName);
//            System.out.println(studentList.get(i).lastName);
//            System.out.println(studentList.get(i).studentId);
//            System.out.println(studentList.get(i).age);
//
//        }

    }


}
