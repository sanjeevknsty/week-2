class Product{
    String productName;
    int price;

    static int totalProducts = 0;
    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails(){
        System.out.println("ProductName " + productName + " price " + price);
    }

    static public void displayTotalProducts(){
        System.out.println("Total Products " + totalProducts);
    }





}

public class Q1 {

    public static void main(String[] args) {

        Product obj = new Product("Horlics",99);
        obj.displayProductDetails();
        Product obj2 = new Product("Boost",129);
        obj2.displayProductDetails();

        Product.displayTotalProducts();
    }

}
