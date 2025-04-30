class Book{
    String title;
    String author;
    int price;
    public Book(String title,String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(){
        this.title = "title";
        this.author = "author";
        this.price = 20202;

    }

    public void display(){
        System.out.println("title "+ title);
        System.out.println("author "+ author);
        System.out.println("price "+ price);
    }
}

public class Q1 {

    public static void main(String[] args) {
        Book obj1 = new Book("LM10","maxmus desmus meridias",699);
        Book obj2 = new Book();
        obj1.display();
        obj2.display();
    }
}
