
abstract class Product{
    private int productId;
    private String name;
    private int price;

    public Product(int productId,String name,int price){
        this.price = price;
        this.productId = productId;
        this.name = name;
    }
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public abstract double calculateDiscount();

}

class Electronics extends Product implements Taxable{

    public Electronics(int productId,String name,int price){
        super(productId,name,price);

    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.1;
    }
    @Override
    public double calculateTax(){
        return getPrice() * 0.18;
    }
    @Override
    public String getTaxDetails(){
        return " 18 % tax";
    }



}

class Clothing extends Product implements  Taxable{
    public Clothing(int productId,String name,int price){
        super(productId,name,price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.5;
    }
    @Override
    public double calculateTax(){
        return getPrice() * 0.10;
    }
    @Override
    public String getTaxDetails(){
        return " 10% Tax ";
    }

}

class Groceries extends Product{

    public  Groceries(int productId,String name,int price){
        super(productId,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice() * 0.2;
    }

}


interface Taxable{

    double calculateTax();
    String getTaxDetails();
}




public class Q2 {
    public static void calculateFinalPrice(Product product) {
        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
        double finalPrice = price + tax - discount;

        System.out.println(product.getName() + "  Final Price " + finalPrice);
        if (product instanceof Taxable) {
            System.out.println(((Taxable) product).getTaxDetails());
        }
    }
    public static void main(String[] args) {
        Product laptop = new Electronics(101, "Laptop", 60000);
        Product tshirt = new Clothing(102, "T-Shirt", 1500);
        Product rice = new Groceries(103, "Rice", 800);

        calculateFinalPrice(laptop);
        System.out.println();
        calculateFinalPrice(tshirt);
        System.out.println();
        calculateFinalPrice(rice);
    }
}
