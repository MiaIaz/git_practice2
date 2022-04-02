package day35_Encapulation.bankAccountTask;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Mia",9272484982477467l,15000);
        System.out.println(account1);

        BankAccount account2 = new BankAccount("Natalia",64386484379874l,-12);
        System.out.println(account2);

        account1.setBalance(18000);
        account1.checkBalance();
        account1.deposit(3000);
        account1.withdraw(1000);
        account1.checkBalance();


    }

}
