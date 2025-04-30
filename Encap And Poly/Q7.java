import java.util.ArrayList;

abstract class Patient{
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId,String name,int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPateintDetails(){
        System.out.println("Id :"+ patientId);
        System.out.println("Name :"+ name);
        System.out.println("Age : " +age);
    }
}


class InPateint extends Patient implements  MedicalRecord{
    ArrayList<String> diagnosis ;
    public InPateint(int patientId , String name, int age){
        super(patientId,name,age);
        this.diagnosis = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return 0;
    }
    @Override
    public void addRecord(String diagnosis){
        this.diagnosis.add(diagnosis);
    }

    @Override
    public void viewRecords(){
        System.out.println("Records");
        for(String i : diagnosis){
            System.out.println("Disease "+ i);
        }
    }
}

class OutPateint extends Patient implements MedicalRecord{

    ArrayList<String> diagnosis ;

    public OutPateint(int patientId , String name, int age){
        super(patientId,name,age);
        this.diagnosis= new ArrayList<>();

    }

    @Override
    public double calculateBill() {
        return 0;
    }

    @Override
    public void addRecord(String diagnosis){
        this.diagnosis.add(diagnosis);
    }

    @Override
    public void viewRecords(){
        System.out.println("Records");
        for(String i : diagnosis){
            System.out.println("Disease "+ i);
        }
    }
}


interface MedicalRecord{
    void addRecord(String diagnosis);
    void viewRecords();
}

public class Q7 {

    public static void main(String[] args) {

        Patient inPateintObj1 = new InPateint(12,"Ramu",25);
        Patient inPateintObj2 = new InPateint(13,"Raju",34);

        inPateintObj1.getPateintDetails();
        System.out.println("***************");
        inPateintObj2.getPateintDetails();

        ((MedicalRecord) inPateintObj1).addRecord("Brain Tumor");
        ((MedicalRecord) inPateintObj1).addRecord("Fracture");
        ((MedicalRecord) inPateintObj1).viewRecords();




        Patient outPateintObj1 = new OutPateint(2322,"Mike",20);
        Patient outPateintObj2 = new OutPateint(2344,"Mayer",25);

        outPateintObj1.getPateintDetails();
        System.out.println("***************");
        outPateintObj2.getPateintDetails();



    }
}
