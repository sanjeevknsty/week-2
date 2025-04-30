class Circle{
    double radius;
    public Circle(double radius){
        System.out.println("Parametirized");
        this.radius = radius;
    }

    public Circle(){
        System.out.println("default");
        this.radius = 12.9;
    }


    public void display(){
        System.out.println("Radius " + radius);
    }



        }
public class Q2 {
    public static void main(String[] args) {

        Circle obj2 = new Circle(999.99);
        obj2.display();
        Circle obj = new Circle();
        obj.display();



    }
}
