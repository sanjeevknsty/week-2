
abstract class Vehicle{
    private int vehicleId;
    private String driverName;
    private int ratePerKm;

    public Vehicle(int vehicleId,String driverName,int ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails(){
        System.out.println("Id : " + vehicleId);
        System.out.println("Name : " + driverName);
        System.out.println("Rate Per KM : " + ratePerKm);
    }

    public  int getRatePerKm(){
        return ratePerKm;
    }

}

interface GPS{
    String getCurrentLocation();
    String updateLocation();
}

class Car1 extends Vehicle  implements GPS{


    public Car1(int vehicleId,String driverName,int ratePerKm){
        super(vehicleId,driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation(){
        return "Current Location";
    }
    @Override
    public String updateLocation(){
        return "Updated Location";
    }
}

class Bike1 extends Vehicle  implements GPS{

    public Bike1(int vehicleId,String driverName,int ratePerKm){
        super(vehicleId,driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation(){
        return "Current Location";
    }
    @Override
    public String updateLocation(){
        return "Location Updated";
    }
}

class Auto extends Vehicle  implements GPS{
    public Auto(int vehicleId,String driverName,int ratePerKm){
        super(vehicleId,driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation(){
        return "Current Location ";
    }
    @Override
    public String updateLocation(){
        return "Location Updated";
    }
}



public class Q8 {

    public static void main(String[] args) {

        Vehicle carObj = new Car1(23,"John",10);
        Vehicle bikeObj = new Bike1(244,"Venu",12);
        Vehicle  autoObj = new Auto(343,"siraj",7);

        System.out.println("Total Fare Car " + carObj.calculateFare(300));
        System.out.println("**********");
        System.out.println("Total Fare Bike " + bikeObj.calculateFare(200));
        System.out.println("**********");
        System.out.println("Total Fare Auto " + autoObj.calculateFare(100));
        System.out.println("**********");

        System.out.println(((GPS) carObj).getCurrentLocation());
        System.out.println(((GPS) carObj).updateLocation());




    }
}
