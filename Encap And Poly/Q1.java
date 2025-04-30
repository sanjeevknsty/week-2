abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }



    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

class EmployeeWithDepartment extends FullTimeEmployee implements Department {
    private String department;

    public EmployeeWithDepartment(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {

        return "Department: " + department;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 1000, 20);

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        e2.calculateSalary();

        EmployeeWithDepartment e3 = new EmployeeWithDepartment(103, "Charlie", 60000);
        e3.assignDepartment("HR");
        System.out.println();
        System.out.println(e3.getDepartmentDetails());
        e3.displayDetails();
    }
}
