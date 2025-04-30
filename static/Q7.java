class Patient {
    static String hospitalName = "ABC Hospital";
     static int totalPatients = 0;

     final int patientID;
     String name;
     int age;
     String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name " + hospitalName);
            System.out.println("ID " + patientID);
            System.out.println("Name " + name);
            System.out.println("Age " + age);
            System.out.println("Ailment " + ailment);
        }
    }


}

public class Q7 {

    public static void main(String[] args) {
        Patient patient1 = new Patient(101234, "Alice", 30, "Fracture");
        Patient patient2 = new Patient(10234, "Bob", 45, "Fever");

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        System.out.println("Total " + Patient.getTotalPatients());
    }
}
