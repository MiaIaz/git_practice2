package day31_Constructor;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double balance;




    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        if(amount <= 0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;
    }


    public void setInfo(String ahmet_ozkok, int i) {
    }
}
