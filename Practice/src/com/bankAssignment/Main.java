package com.bankAssignment;

import java.util.*;


public class Main {

 

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String name1;
        String address1;
        int accountNumber;
        double amount;
        Users user1=new Users();
        Users user2=new Users();
        Bank bank=new Bank();
        boolean quit = false;
        do
        {
            System.out.println("enter\n 1.creating user1 account \n 2.creating user2 account \n 3.transfer from user1 to user2 "
                    + "\n 4.transfer from user2 to user1"+"\n 5.Exit");
            int choice=sc.nextInt();
        switch(choice)
        {
        
        case 1:  System.out.println("enter your name: ");
                 name1=sc.next();
                 System.out.println("enter your address: ");
                 address1=sc.next();
                 System.out.println("enter your account number: ");
                 accountNumber=sc.nextInt();
                 System.out.println("enter the amount for initial deposition: ");
                 amount=sc.nextDouble();
                 Account acc1=new Account(accountNumber,amount);
                 user1=new Users(acc1,name1,address1);
                 System.out.println("THANK YOU FOR CHOOSING HDFC BANK");
                 System.out.println("----------------------------------------");
                 break;
        case 2:  System.out.println("enter your name: ");
                 name1=sc.next();
                 System.out.println("enter your address: ");
                 address1=sc.next();
                 System.out.println("enter your account number: ");
                 accountNumber=sc.nextInt();
                 System.out.println("enter the amount for initial deposition: ");
                 amount=sc.nextDouble();
                 Account acc2=new Account(accountNumber,amount);
                 user2=new Users(acc2,name1,address1);
                 System.out.println("THANK YOU FOR CHOOSING HDFC BANK");
                 System.out.println("----------------------------------------");
                 break;  
        case 3:  System.out.println("enter the amount for transfer from user1 to user2");
                 amount=sc.nextDouble();
                 bank.transaction(user1, user2, amount);
                 break;
        case 4:  System.out.println("enter the amount for transfer from user2 to user1");
                 amount=sc.nextDouble();
                 bank.transaction(user1, user2, amount);
                 break;
        case 5:
			quit = true;
			System.out.println("Thank you for your visit !...");
			break;
        default: System.out.println("invalid option");
                 
        }
    
    }while (!quit);

 

    }
}
 