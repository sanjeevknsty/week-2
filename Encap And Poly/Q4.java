
abstract class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double deposit(double amount){
        return  balance += amount;
    }

    public double withdraw(double amount){
        return balance-= amount;
    }

    public double getBalance(){
        return balance;
    }

    public abstract double calculateInterest();

}

class SavingsAccount  extends BankAccount implements Loanable{
    private double interestRate;

    public SavingsAccount (int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(){
        System.out.println("Loan Applied");
    }

    public void calculateLoanEligibility(){
        System.out.println("Loan Eligibility Calculated");
    }


}

class CurrentAccount extends BankAccount{
    private double interestRate;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

}

interface Loanable{
    void applyForLoan();

    void calculateLoanEligibility();

}

public class Q4 {
    public static void calculateInterest(BankAccount account) {
        double interest = account.calculateInterest();
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: ₹" + account.getBalance());
        System.out.println("Interest: ₹" + interest);
        System.out.println("***********************");
        if(account instanceof Loanable){
            ((Loanable) account).applyForLoan();
            ((Loanable) account).calculateLoanEligibility();
        }else {
            System.out.println("Not Eligible For Loan");
        }
    }
    public static void main(String[] args) {

        BankAccount savingAcc = new SavingsAccount (10122, "Mob", 10077, 0.05);
        BankAccount savingAcc2 = new SavingsAccount (10133, "Bob", 30000, 0.2);

        calculateInterest(savingAcc2);
        System.out.println();
        calculateInterest(savingAcc);

        savingAcc.deposit(10000);
        calculateInterest(savingAcc);

        savingAcc.withdraw(1000);
        calculateInterest(savingAcc);



        BankAccount currAcc = new CurrentAccount(12344,"Mob",20000,0.04);
        calculateInterest(currAcc);
    }
}
