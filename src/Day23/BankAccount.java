package Day23;

import java.util.Random;

public class BankAccount {
    int accountNumber;
    int routingNumber;
    String firstName;
    double balance;
    String address;

    public void printAccountDetails(){
        System.out.println(accountNumber);
        System.out.println(routingNumber);
        System.out.println(firstName);
        System.out.println(balance + "$");
        System.out.println(address);
        System.out.println();
    }

    public void deposit(double money){
        balance += money;
    }

    public void cashOut(double money){
        balance -= money;
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = 123;
        bankAccount1.routingNumber = 124;
        bankAccount1.firstName = "Michael";
        bankAccount1.address = "Cumberland 4";

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.accountNumber = 234;
        bankAccount2.routingNumber = 235;
        bankAccount2.firstName = "Angel";
        bankAccount2.address = "Devon 6";

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.accountNumber = 345;
        bankAccount3.routingNumber = 456;
        bankAccount3.firstName = "Alex";
        bankAccount3.address = "Dempster 5";

        System.out.println("DEPOSITS");
        bankAccount1.deposit(500);
        bankAccount1.deposit(350);

        bankAccount2.deposit(1000);

        bankAccount3.deposit(4000);

        bankAccount1.printAccountDetails();
        bankAccount2.printAccountDetails();
        bankAccount3.printAccountDetails();

        System.out.println("CASHOUT");
        bankAccount1.cashOut(1500);
        bankAccount2.cashOut(200);
        bankAccount3.cashOut(3500.99);

        bankAccount1.printAccountDetails();
        bankAccount2.printAccountDetails();
        bankAccount3.printAccountDetails();


        BankAccount[] bankAccounts = {bankAccount1, bankAccount2, bankAccount3};
        Random random = new Random();
        System.out.println("ASSIGNING RANDOM BALANCE to ACCOUNTS");
        for(int i = 0; i < bankAccounts.length; i++){
            bankAccounts[i].balance += random.nextInt(100, 10000);
        }
        bankAccount1.printAccountDetails();
        bankAccount2.printAccountDetails();
        bankAccount3.printAccountDetails();

    }


}
