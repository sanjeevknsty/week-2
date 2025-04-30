
abstract class FoodItem{
    private String FoodItem;
    private int price;
    private int quantity;

    public FoodItem(String foodItem,int price,int quantity){
        this.FoodItem = foodItem;
        this.price = price;
        this.quantity = quantity;
    }
    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Food Item- " + FoodItem);
        System.out.println("prica- " + price);
        System.out.println("Qantity- " + quantity);
    }

    public double getPrice(){
        return price;
    }

    public double getQuantity(){
        return quantity;
    }

}

interface Discountable{
    double applyDiscount();
    void getDiscountDetails();

}



class NonVegItem extends FoodItem{

    private double charges = 0.18;
    public NonVegItem(String foodItem,int price,int quantity){
        super(foodItem,price,quantity);
    }

    @Override
    public double calculateTotalPrice(){
        return getPrice()*charges+ getPrice() * getQuantity();
    }

}

class VegItem extends FoodItem implements Discountable{

    public VegItem(String foodItem,int price,int quantity){
        super(foodItem,price,quantity);
    }

    @Override
    public double calculateTotalPrice(){
        return getPrice() * getQuantity();
    }

    public double applyDiscount(){
        return calculateTotalPrice() * 0.1;
    }

    public void getDiscountDetails(){
        System.out.println("Discount 10%");
        System.out.println("Discounted price " + (calculateTotalPrice()-applyDiscount()));

    }

}


public class Q6 {

    public static void main(String[] args) {
        FoodItem nonVegObj = new NonVegItem("Prawn",300,3);
        FoodItem VegObj = new VegItem("Mushroom",200,2);
        nonVegObj.getItemDetails();
        System.out.println(nonVegObj.calculateTotalPrice());
        System.out.println("**********");



        VegObj.getItemDetails();
        System.out.println(VegObj.calculateTotalPrice());
        ((Discountable) VegObj).applyDiscount();
        ((Discountable) VegObj).getDiscountDetails();
        System.out.println("**********");

    }

}
