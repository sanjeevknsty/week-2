
class Book{

    static String libraryName = "ABC Library";
    public String title;
    public String author;
    final int isbn;

    public Book(String title,String author,int isbn){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static public void displayLibraryName(){
        System.out.println("Libraray Name " + libraryName);
    }
    public void display(){
        if(this instanceof Book){
            displayLibraryName();
            System.out.println("Title " + title);
            System.out.println("Author " + author);
            System.out.println("ISBN " + isbn);
        }
    }

}
public class Q2 {
    public static void main(String[] args) {
        Book obj = new Book("TOT","Robo",435350);
        obj.display();
    }
}
