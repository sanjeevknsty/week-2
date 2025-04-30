public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }
        else
            System.out.println("Insufficient Funds");
        return balance;
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("sanjeev", 10111, 100000);
        double depositAmount = b1.deposit(500);
        System.out.println("Deposit Amount: " + depositAmount);
        b1.display();
        double withDrawAccount = b1.withdraw(500);
        System.out.println("Withdraw Amount: " + withDrawAccount);
        b1.display();
    }
}
