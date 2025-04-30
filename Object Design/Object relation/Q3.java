import java.util.ArrayList;

class Company{
    private String name;

    ArrayList<Department> departments;
    public Company(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addDepartment(Department dept){
        departments.add(dept);
    }

    public void deleteComp(){
        System.out.println("Deleting "+name);
        for(Department i : departments){
            System.out.println("Deleting "+i.getDeptName());
            i.displayEmp();
            i.delEmp();
        }
        departments.clear();
    }




    public void displayDepartments(){
        if(departments.isEmpty())
            System.out.println("No DepartMents");
        for(Department i : departments){
            System.out.println(i.getDeptName());

        }
    }


}

class Department{
    private String deptName;
    private Company company;

    ArrayList<Employee> employees;
    public Department(String deptName,Company company){
        this.deptName = deptName;
        this.company = company;
        this.employees = new  ArrayList<>();
        company.addDepartment(this);
    }

    public void delEmp(){
        employees.clear();
    }

   public void displayEmp(){
        System.out.println("Employees in "+deptName + " " +company.getName());
        if(employees.isEmpty()){
            System.out.println("No departMents");
        }
        for(Employee i : employees){
            System.out.println(i.getName());
        }
   }

    public  String getDeptName(){
        return this.deptName;
    }



    public void addEmployee(Employee emp){
        employees.add(emp);
    }
}


class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        department.addEmployee(this);
    }



    public String getName() {
        return name;
    }
}


public class Q3 {
    public static void main(String[] args) {

        Company cmpObj1 = new Company("Google");
        Company cmpObj2 = new Company("Microsoft");

        Department deptObj = new Department("Tech",cmpObj1);
        Department deptObj2 = new Department("Non Tech",cmpObj1);

        System.out.println("Google Departments");
        cmpObj1.displayDepartments();

        System.out.println();
        Department deptObj3 = new Department("Tech",cmpObj2);
        Department deptObj4 = new Department("Non Tech",cmpObj2);
        System.out.println("Microsoft Departments");
        cmpObj2.displayDepartments();

        Employee empObj1 = new Employee("Sanjeev",deptObj);
        Employee empObj2 = new Employee("Ramu",deptObj);


        Employee empObj3 = new Employee("Raju",deptObj2);
        Employee empObj4 = new Employee("Venu",deptObj2);

        deptObj.displayEmp();
        deptObj2.displayEmp();

        deptObj3.displayEmp();
        deptObj4.displayEmp();

        System.out.println();

        cmpObj1.deleteComp();
        System.out.println();
        cmpObj1.displayDepartments();

    }
}
