//ATM Interface
package com.atmInterface;

import java.util.Scanner;
import java.lang.InterruptedException;

class BankAccount {
    private double balance;
    private double initialBalance = 500;

    public BankAccount() {

        this.balance = initialBalance;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void deposit(double amount){

        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("\n Your Money has been successfully Deposited ");
            System.out.println(" New balance is: Rs. " +balance);

            try {
                Thread.sleep(2000); // Simulate some processing time
            }
            catch (InterruptedException e) {
                System.out.println("Loading...");
                //e.printStackTrace();
            }
        }
        else{
            System.out.println("\n Invalid amount for Deposit");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("\n Withdrawal Successfully..");
            System.out.println(" Now Your Balance is Rs. "+ balance);

            System.out.println("\n* Please collect your Money and Card.");

            try {
                Thread.sleep(2500); // Simulate some processing time
            }
            catch (InterruptedException e) {
                System.out.println("Loading...");
                //e.printStackTrace();
            }

        }
        else{
            System.out.println("\n Sorry! Insufficient Funds");
        }
    }

}

class ATM{
    private BankAccount account;
    Scanner sc = new Scanner(System.in);

    public ATM(BankAccount account) {

        this.account = account;
    }

    public void showMenu(){
        System.out.println("\n ");
        System.out.println("--------------------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("--------------------------------");
    }

    public void run(){
        int choice;

        do{

            showMenu();

            System.out.println("\n Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println("\nTHANKYOU! for using the ATM..");
                    break;

                default:
                    System.out.println("Invalid choice! Please select the valid option");
                    break;

            }
        }while (choice != 4);
    }

    private void checkBalance() {
        System.out.println("\n=> Your current Balance is: Rs. " +account.getBalance());

        try {
            Thread.sleep(2000); // Simulate some processing time
        } catch (InterruptedException e) {
            System.out.println("Loading...");
            //e.printStackTrace();
        }

    }

    private void deposit(){
        System.out.println("\n=> Enter Your Deposit Amount: Rs. ");

        double amount = sc.nextDouble();
        account.deposit(amount);

    }

    private void withdraw(){
        System.out.println("\n=> Withdrawal Balance is: Rs. ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

}

//Main Method
public class ATMInterface {
    public static void main(String[] args){

        System.out.println("\n ");
        System.out.println("+==============================+");
        System.out.println("+\t Welcome to ATM machine    +");
        System.out.println("+==============================+");
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Please Enter your 4 Digit Pin: ");
        int PIN = sc.nextInt();
        if(PIN == 1234){

            System.out.println("\n PIN Entered Successfully..");
            BankAccount b = new BankAccount();
            ATM a = new ATM(b);

            a.run();
        }
        else {
            System.out.println("\n Wrong! Enter your correct Password");
        }

    }
}
