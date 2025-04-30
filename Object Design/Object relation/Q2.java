import java.util.ArrayList;
import java.util.Arrays;

class Bank{
    ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();

    }

    public void openAccount(int accountNumber,Customer cust,double balance){
        Account account = new Account(accountNumber,cust,balance);
        accounts.add(account);
        cust.accounts.add(account);
    }

}


class Customer{
    String name;

    Bank bank;

    ArrayList<Account> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void viewBalance(int accountNumber){
        for(Account i : accounts){
            if( i.getAccountNumber() == accountNumber){
                System.out.println("Balance is "+i.getBalance());
            }
        }

    }



}

class Account {
    private int accountNumber;

    private String accountHolderName;
    private double balance;
    public Account( int accountNumber,Customer customer, double balance) {
        this.balance = balance;
        this.accountHolderName = customer.name;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}


public class Q2 {
    public static void main(String[] args) {
        Customer customerObj = new Customer("Ranga");
        Customer customerObj2 = new Customer("Ballu");

        Bank bankObj = new Bank();

        bankObj.openAccount(2243242,customerObj,243234);
        bankObj.openAccount(12345,customerObj2,99999);

        customerObj.viewBalance(2243242);
        System.out.println();
        customerObj2.viewBalance(12345);
    }
}
