import java.util.ArrayList;
import java.util.Arrays;

class CartItem1 {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem1(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public String display() {
        return itemName + "  " + price + " * " + quantity + " = " + getTotalCost();
    }


}

class ShoppingCart {
    private ArrayList<CartItem1> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {

        System.out.println(Arrays.toString(cart.toArray()));

        for (CartItem1 item : cart) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cart.add(new CartItem1(itemName, price, quantity));
    }

    public void removeItem(String itemName) {

        for (CartItem1 item : cart){
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                System.out.println("Removed Item: " + item.getItemName());
                cart.remove(item);
                return;
            }

        }
            System.out.println("No such item");

//        cart.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
    }

    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("Cart Items:");
        for (CartItem1 item : cart) {
            System.out.println("CART ITEM "+item.display());
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: " + totalCost);
    }
}

public class CartItem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 50.0, 2);
        cart.addItem("Banana", 20.0, 5);
        cart.addItem("Apple", 50.0, 1); // Adds to existing "Apple" item quantity

        cart.displayTotalCost();

        cart.removeItem("Banana");

        cart.displayTotalCost();
    }
}
