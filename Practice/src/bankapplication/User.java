package bankapplication;

import java.util.Scanner;

public class User implements Bank{
	Scanner input = new Scanner(System.in);
	String name, actype;
	int accNo, bal, amt;
	public User(String name, String actype, int accNo, int bal) {
		super();
		this.name = name;
		this.actype = actype;
		this.accNo = accNo;
		this.bal = bal;
	
	}
	public int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		else {
		bal = bal + amt;
		
		System.out.println("Current Amount :"+bal);
		}
		return 1;
	}

	public int withdraw() {
		System.out.println("Your Balance=" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
	
		if (bal < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		else
		{
			bal = bal - amt;
			
			System.out.println("Current Amount :"+bal);
		}
		return 1;
		
	}

	public void display() {
		System.out.println("=============================================================");
		System.out.println("Name:" + name);
		System.out.println("Account No:" + accNo);
		System.out.println("Balance:" + bal);

	}

	public void dbal() {
		
		System.out.println("Balance:" + bal);
	}

	

}
