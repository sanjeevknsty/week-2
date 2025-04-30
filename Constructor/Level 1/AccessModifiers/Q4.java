
class Employee{

    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID,String department,double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void display(){

        System.out.println("ID " + employeeID);
        System.out.println("Department " + department);
        System.out.println("Salary " + salary);

    }



}

class Manager extends Employee{
    public Manager(int employeeID,String department,double salary){
        super(employeeID,department,salary);
    }

    public void displayManager(){
        System.out.println("ID " + employeeID);
        System.out.println("Department " + department);
    }

}



public class Q4 {
    public static void main(String[] args) {
        Employee obj = new Employee(3112,"Full Stack " ,3343.34);
        obj.display();
        System.out.println();
        obj.setSalary(234243.23);
        obj.display();
        System.out.println();

        Manager obj2 = new Manager(42423,"Manager",242342.20);
        obj2.displayManager();

    }
}
