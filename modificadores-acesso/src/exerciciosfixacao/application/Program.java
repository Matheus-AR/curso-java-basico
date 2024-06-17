package exerciciosfixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosfixacao.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		// Entrar com o numero da conta
		System.out.print("Enter account number: ");
		String number = sc.nextLine();
		
		// Entrar com o nome da conta
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		// Perguntar se tem deposito inicial
		System.out.print("Is there an initial deposit (y/n): ");
		char choice = sc.next().charAt(0);
		
		// se sim, entrar com o valor do deposito
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			// Criar conta com deposito inicial
			account = new Account(number, name, initialDeposit);
		} else {
			// Criar conta sem deposito inicial
			account = new Account(number, name);
		}
		
		
		// Mostrar a conta
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		// Fazer depósito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		// Mostrar a conta
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		
		// Fazer saque
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.toWithdraw(value);
		
		// Mostrar a conta
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		sc.close();
	}

}
