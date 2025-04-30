
class BankAccount {

    static String bankName = " SBI ";
    String accountHolderName;
    final int accountNumber ;

    public BankAccount(String accountHolderName,int accountNumber){
        this.accountNumber= accountNumber;
        this.accountHolderName =accountHolderName;

    }

    static public void getTotalAccount(){

    }
    public void displayAccountDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);

    }

}

public class Q1 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("John",232);
        if(obj instanceof  BankAccount){
            obj.displayAccountDetails();
        }

    }
}
