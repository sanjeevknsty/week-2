abstract class Vehicle1{
    private String vehicleNUmber;
    private String type;
    private int rentalRate;
    public Vehicle1(String vehicleNumber, String type, int rentalRate){
        this.rentalRate = rentalRate;
        this.type = type;
        this.vehicleNUmber = vehicleNumber;
    }
    public abstract double calculateRentalCost(int days);

    public int getRentalRate(){
        return rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNUmber;
    }

}

class Car extends Vehicle1 implements Insurable{


    public Car(String vehicleNumber, String type, int rentalRate){
        super(vehicleNumber,type,rentalRate);
    }
    @Override

    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    @Override

    public double calculateInsuranceCost(){
        return getRentalRate() * 0.1;
    }
    @Override

    public String getInsuranceDetails(){
        return "10% Insurance";
    }

}


class Bike extends Vehicle1 implements Insurable{


    public Bike(String vehicleNumber, String type, int rentalRate){
        super(vehicleNumber,type,rentalRate);
    }
    @Override

    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    @Override

    public double calculateInsuranceCost(){
        return getRentalRate() * 0.1;
    }
    @Override

    public String getInsuranceDetails(){
        return "10% Insurance";
    }

}

class Truck extends Vehicle1{


    public Truck(String vehicleNumber, String type, int rentalRate){
        super(vehicleNumber,type,rentalRate);
    }
    @Override

    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
}

interface Insurable{
    double calculateInsuranceCost();
    String getInsuranceDetails();
}

public class Q3 {

    public static void calculateTotalCost(Vehicle1 vehicle, int days) {
        double rentalCost = vehicle.calculateRentalCost(days);
        double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsuranceCost() : 0.0;
        double totalCost = rentalCost + insuranceCost;

        System.out.println( vehicle.getVehicleNumber());
        System.out.println("Rental Cost: ₹" + rentalCost);
        if (vehicle instanceof Insurable) {
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println("Insurance Cost: ₹" + insuranceCost);
        }
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Vehicle1 carObj = new Car("AP26BU0359","Mini SUV",2500);
        Vehicle1 bikeObj = new Bike("AP01BU0009","Sports",500);
        Vehicle1 truckObj = new Truck("MH45RH0264","Long Wheel",4000);

        calculateTotalCost(carObj, 5);
        calculateTotalCost(bikeObj, 5);
        calculateTotalCost(truckObj, 5);
    }



}
