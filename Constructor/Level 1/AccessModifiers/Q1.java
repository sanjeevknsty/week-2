
class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber,String name,double CGPA){

        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;

    }
    public double getCGPA(){
        return CGPA;
    }

    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }


}

class postgraduateStudent extends Student{
    public postgraduateStudent(int rollNumber, String name, double CGPA){
        super(rollNumber,name,CGPA);
    }
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

}


public class Q1 {
    public static void main(String[] args) {

        Student obj2 = new Student(101, "Alice", 8.5);
        System.out.println("Student ");
        obj2.display();
        obj2.setCGPA(4.4);
        System.out.println();
        System.out.println("Student ");
        obj2.display();

        System.out.println();

        postgraduateStudent obj = new postgraduateStudent(123123,"sanjeev",9.6);
        System.out.println("PG Student ");
        obj.display();
    }
}
