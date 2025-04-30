abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId,String title,String author){
        this.itemId = itemId;
        this.author = author;
        this.title= title;
    }

    public  abstract double loanDuration();

    public void getItemDetails(){
        System.out.println("Item Id " + itemId);
        System.out.println("Title " + title);
        System.out.println("Author " + author);
    }
}

class Book extends LibraryItem implements Reversable{
    private boolean isAvailable = true;
    public  Book(int itemId,String title,String author){
        super(itemId,author,title);
    }

    @Override
    public double loanDuration(){
        return 15;
    }


    public void reverseItem(){if(isAvailable){
        isAvailable = false;
        System.out.println("Reserved");
    }else {
        System.out.println("Not Available");
    }}
    public boolean checkAvailability(){
        return isAvailable;
    }
}


class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, author, title);
    }

    @Override
    public double loanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reversable{
    private boolean isAvailable = true;

    private int price ;
        public  DVD(int itemId,String title,String author){
            super(itemId,author,title);
            this.price = 200;
        }

        @Override
        public double loanDuration(){
            return 15;
        }


    public void reverseItem(){
            if(isAvailable){
                isAvailable = false;
                System.out.println("Reserved");
            }else {
                System.out.println("Not Available");
            }
    }
    public boolean checkAvailability(){
        return isAvailable;
    }

    }


interface Reversable{
    void reverseItem();
    boolean checkAvailability();
}

public class Q5 {

    public static void main(String[] args) {

        LibraryItem bookObj = new Book(3232,"Tiles","Ramuuu");
        LibraryItem magazineObj = new Magazine(343,"Hilfiger","Tommy");
        LibraryItem  dvdObj = new DVD(244,"Covers","Kohli");

        bookObj.getItemDetails();

        System.out.println("Book Availability " + ((Reversable) bookObj).checkAvailability());
        ((Reversable)bookObj).reverseItem();
        System.out.println("DVD Availability " + ((Reversable) dvdObj).checkAvailability());

    }

}
