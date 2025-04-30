public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        double area= circle.area();
        System.out.println("Area " +area);

        double circumference = circle.circumference();
        System.out.println("Circumference " +circumference);
    }
}
