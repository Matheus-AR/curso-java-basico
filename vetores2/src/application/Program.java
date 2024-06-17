package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Product[] products = new Product[N];
		
		for(int i = 0; i < products.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			products[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getPrice();
		}
		double avg = sum / products.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}

}
