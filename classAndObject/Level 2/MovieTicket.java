public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0;
    }

    public void bookTikcet(String seatNumber, double price) {

    this.seatNumber = seatNumber;
    this.price = price;
    }

    public void display(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);

    }

    public static void main(String[] args) {
        MovieTicket obj = new MovieTicket("Debha Debha");
        obj.bookTikcet("A7", 500);
        obj.display();
    }
}
