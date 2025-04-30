class CarRental{

    String customerName;
    String carModel;
    int rentalDays;
    static int price = 1000;
    public CarRental(String customerName,String carModel,int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;

    }

    public void details(){
        System.out.println("Name "+ customerName + " carModel " + carModel + " Rental Days " + rentalDays);
        System.out.println(rentalDays * price);
    }

}

public class Q6 {
    public static void main(String[] args) {

        CarRental obj = new CarRental("Raj","M5 Competition",4);
        obj.details();

        CarRental obj2 = new CarRental("Ram","M340i",3);
        obj2.details();

    }
}
