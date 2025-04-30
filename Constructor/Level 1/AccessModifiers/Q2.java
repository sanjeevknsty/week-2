
class Book{
    public int ISBN;
    protected String title;
    private  String author;
    public Book(int ISBN ,String title,String author ){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor( String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void display(){
        System.out.println("ISBN " + ISBN);
        System.out.println("Title " + title);
        System.out.println("Author " + author);
    }

}

class EBook extends Book{
    public EBook(int ISBN ,String title,String author ){
    super(ISBN ,title, author);


    }

    public void displayEbook(){
        System.out.println("ISBN " + ISBN);
        System.out.println("Title " + title);
        System.out.println("Author " + getAuthor());    }

}



public class Q2 {
    public static void main(String[] args) {
        Book obj = new Book(12312,"MeMeMe","Appa rao");

        obj.display();

        System.out.println();
        obj.setAuthor(" MeMeMe Author");
        obj.display();

        EBook obj2 = new EBook(123221,"EBook MEME","Pulla Rao");
        System.out.println();
        obj2.displayEbook();

    }
}
