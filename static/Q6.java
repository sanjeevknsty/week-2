class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration  " + registrationNumber);
            System.out.println("Owner  " + ownerName);
            System.out.println("Vehicle Type " + vehicleType);
            System.out.println("Registration Fee " + registrationFee);
        }
    }


}


public class Q6 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice", "Car", "AP01Bu0359");
        Vehicle vehicle2 = new Vehicle("Bob", "Bike", "AP02CD5678");

        Vehicle.updateRegistrationFee(5530.0);

        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}
