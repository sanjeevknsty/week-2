import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Library Books");
        for (Book i : books) {
            i.displayBook();
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "John");
        Book book2 = new Book("TOT D", "Lee");

        Library library1 = new Library();
        Library library2 = new Library();

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book1);

        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}


