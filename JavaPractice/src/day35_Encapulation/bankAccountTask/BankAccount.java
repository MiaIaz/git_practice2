package day35_Encapulation.bankAccountTask;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        if(amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

}
/*
5. create a class named BankAccount
Private variables:
accountHolder, accountNumber, balance
encapsulate all the fields
Add a constructor that allows user to set all the fields when the
object is created.
(If the arguments not valid it should not be set
to the instances)
Extra methods:
deposit()
withdraw()
check balance()
toString()
DO NOT duplicate any code fragments
 */