import java.rmi.StubNotFoundException;

class Student {
    private static String universityName = "ABC University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students  " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University " + universityName);
            System.out.println("Name " + name);
            System.out.println("Roll Number " + rollNumber);
            System.out.println("Grade " + grade);
        }
    }


}


public class Q5 {
    public static void main(String[] args) {
        Student student1 = new Student("john", 10231, "A");
        Student student2 = new Student("bob", 12302, "B");

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
