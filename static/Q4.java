class Product {
    static double discount = 0.0;
     final int productID;
     String productName;
     double price;
     int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("ID " + productID);
            System.out.println("Product Name " + productName);
            System.out.println("Price " + price);
            System.out.println("Quantity " + quantity);
            System.out.println("Discount " + discount);
        }
    }


}


public class Q4 {
    public static void main(String[] args) {
        Product product1 = new Product(10123, "Laptop", 75556, 2);
        Product product2 = new Product(123202, "Smartphone", 56453, 3);

        Product.updateDiscount(10.0);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
