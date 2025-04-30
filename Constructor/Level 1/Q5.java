class Book1{
    String title;
    String author;
    int price;
    boolean availability;
    public Book1(String title,String author,int price,boolean availability){
        this.title = title;
        this.author= author;
        this.price = price;
        this.availability = availability;
    }

    public void checkBookAvailability(){
        if(this.availability){
            System.out.println("Available");
        }else {
            System.out.println("UnAvailable");
        }
    }



}

public class Q5 {
    public static void main(String[] args) {
        Book1 obj = new Book1("A","Yuvaraj",999,true);
        System.out.println("Book1 " + obj.title);
        obj.checkBookAvailability();

        Book1 obj2 = new Book1("B","Yograj",888,false);
        System.out.println("Book2 " + obj2.title);
        obj2.checkBookAvailability();
    }
}
