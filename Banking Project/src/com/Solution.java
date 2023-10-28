package com;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome to SBI Bank");
		Scanner scan = new Scanner(System.in);
		Bank bank = new BankImpl(10000);
		
		while(true)
		{
			System.out.println("1. Deposit amount\n2. Withdraw Amount\n3. Check Balance.\n4. EXIT");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter amount to be deposited");
				bank.deposit(scan.nextInt()); // int amount = scan.nextInt(); bank.deposit(amount);
				break;
			case 2:
				System.out.println("Enter amount to be withdrawn");
				bank.withdraw(scan.nextInt()); // int amount = scan.nextInt(); bank.deposit(amount);
				break;
			case 3:
				bank.checkBalance();
				break;
			case 4:
				System.out.println("Thank you!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("------------------------------");
		}
	}
}