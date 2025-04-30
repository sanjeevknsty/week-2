public class Item {
    private int itemCode;
    private String itemName;
    private int price;
    public Item (int itemCode, String itemName ,int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void details(){
        System.out.println("ItemCode " +itemCode);
        System.out.println("ItemName " +itemName);
        System.out.println("Price " +price);
    }
    public int cost(int quantity) {
        return quantity*price;
    }
    public static void main(String[] args) {
        Item item = new Item(1, "Steve Smith", 10);
        item.details();
        int totalCost = item.cost(4);
        System.out.println(totalCost);
    }
}
