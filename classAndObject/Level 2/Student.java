import java.util.Arrays;

public class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + Arrays.toString(marks));
    }
    public int calculateGrade() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] marks = {90,80,70};
        Student s1 = new Student("sanjeev", 101, marks);
        s1.display();
        int total = s1.calculateGrade();
        System.out.println("Total Marks "+total);
    }
}
