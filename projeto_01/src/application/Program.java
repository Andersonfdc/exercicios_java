package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		
		switch (response) {
		case 'y':
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			break;
		case 'n':	
			account = new Account(number, holder);
			break;
		default:
			System.out.println("WRONG");
		}
		
		System.out.println();
		System.out.println("Account date: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdaw value: ");
		double withdawValue = sc.nextDouble();
		account.withdraw(withdawValue);
		System.out.println("Update account data: ");
		System.out.println(account);		
		
		
		sc.close();
	}

}
