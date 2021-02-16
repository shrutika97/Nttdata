package bankapplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = input.nextLine();
		System.out.println("Enter Account Number: ");
		int accNo = input.nextInt();
		System.out.println("Enter Account Type: ");
		String actype = input.next();
		System.out.println("Enter Initial Balance: ");
		int bal = input.nextInt();
		Bank b1 = new User(name,actype,accNo, bal);
		int menu;
		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Exit");
		boolean quit = false;
		do {
			System.out.print("Please enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				b1.deposit();
				break;

			case 2:
				b1.withdraw();
				break;

			case 3:
				b1.display();
				break;

			case 4:
				quit = true;
				System.out.println("Thank you for your visit !...");
				break;
			}
		} while (!quit);
	
	}

}
