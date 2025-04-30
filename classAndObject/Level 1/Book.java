public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void details() {
        System.out.println( "Title: " + title + " Author: " + author + " Price: " + price);
    }

    public static void main(String[] args) {
        Book obj = new Book("Na savu Nenu Sasta", "sanjeev", 123);
        obj.details();
    }

}
