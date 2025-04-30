public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id , double salary ) {
        this.name = name ;
        this.id = id;
        this.salary = salary;

    }

    public void display() {
        System.out.println("Name: " + name + " ID: " + id + " Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee obj = new Employee("sanjeev",1232,999999.21);
        obj.display();
    }
}
