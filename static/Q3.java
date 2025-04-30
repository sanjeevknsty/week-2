

class Employee {
    private static String companyName = "ABC company";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println(" ID: " + id);
            System.out.println(" Name: " + name);
            System.out.println(" Designation: " + designation);
            System.out.println("Company Name: " + companyName);
        }
    }


}

public class Q3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12323, "John Doe", "Manager");
        Employee emp2 = new Employee(2232, "Jane Smith", "Engineer");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();
        Employee.displayTotalEmployees();
    }


}
