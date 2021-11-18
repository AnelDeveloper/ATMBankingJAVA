package com.example.mainATM;

import java.util.Scanner;

public class Account {
    int balance = 5000;
    int previousTransaction;
    String CustomerName;
    String CustomerID;

    Account(String cname, String cid) {
        CustomerName = cname;
        CustomerID = cid;
    }

    public void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
            System.out.println("thank you");
        }
    }

    public void getPreviouseTransaction() {
        if (previousTransaction > 0) {
            System.out.print("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.print("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.print("No transaction accrued");

        }
    }



        void ShowMenu() {
            char option = '0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome: " + CustomerName);
            System.out.println("YourID is : " + CustomerID);
            System.out.println();
            System.out.println("ATM Banking is started , What you want to do?");
            System.out.println();
            System.out.println("A. Check your balance");
            System.out.println("B. Make a deposite");
            System.out.println("C. Make a withdraw");
            System.out.println("D. View Previouse Transaction");
            System.out.println("F. Exit");

           do {
                System.out.println();
                System.out.println("Enter a option");
                char option1 = scanner.next().charAt(0);
                option = Character.toUpperCase(option1);
                System.out.println();


                switch(option){

                    case 'A':
                        System.out.println(" Balance: $ " + balance);
                        break;

                    case 'B':
                        System.out.println("Enter amount to deposite");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        System.out.println();
                        break;
                    case 'C':
                        System.out.println("Enter the amount for withdraw");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        System.out.println();
                        break;
                    case 'D':
                        getPreviouseTransaction();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid Please enter Valid KeyWord");
                        break;
                }
            }
           while(option != 'F');
                System.out.println("Thank you for banking US");
        }
}
