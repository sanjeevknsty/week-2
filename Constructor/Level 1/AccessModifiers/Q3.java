
class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;


    public BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void displayBank(){
        System.out.println("Bank Account "+ accountNumber);
        System.out.println("Holder " +accountHolder);
        System.out.println("Balance " +balance);
    }


}


class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber,String accountHolder,double balance){
        super(accountNumber,accountHolder,balance);

    }
    public void displaySavings() {
        System.out.println("Savings Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
    }
}

public class Q3 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(13231231,"bendakai",0.989);
        obj.displayBank();

        System.out.println();

        obj.setBalance(898);

        System.out.println();

        SavingsAccount obj2 = new SavingsAccount(123132,"predator",423.23);
        obj2.displaySavings();

    }
}
