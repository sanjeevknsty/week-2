
class Vehicle{
    String ownerName;
    String vehicleType;

    static int registrationFee = 2000;
    public Vehicle(String ownerName , String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("owner name " + ownerName);
        System.out.println("Vehicle Type " + vehicleType);
        System.out.println("Registration Fee " +registrationFee );
    }
    static public void updateRegistrationFee(int fee){

            registrationFee = fee;
    }


}
public class Q3 {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle("sanjeev","Sedan");
        obj.displayVehicleDetails();
        System.out.println();
        Vehicle obj2 = new Vehicle("MEmeme","SUV");
        Vehicle.updateRegistrationFee(5000);
        obj2.displayVehicleDetails();

    }
}
