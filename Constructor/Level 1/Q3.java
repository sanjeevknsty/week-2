import org.w3c.dom.ls.LSOutput;

class Person{

    String name;
    int age;

    public Person(String name ,int age){
        System.out.println("parameterized");

        this.name = name;
        this.age = age;
    }

    public Person(Person copied){
        System.out.println("Copied");
        this.name = copied.name;
        this.age = copied.age;
    }

    public void display(){
        System.out.println("Name "+ name);
        System.out.println("age "+ age);
    }




}
public class Q3 {
    public static void main(String[] args) {
        Person obj1 = new Person("Sanjeev",22);
        obj1.display();
        Person obj2 = new Person(obj1);
        obj2.display();

    }
}
