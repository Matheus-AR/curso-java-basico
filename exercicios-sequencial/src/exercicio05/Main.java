package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		@SuppressWarnings("unused")
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double total = (qtd1 * valorUnitario1) + (qtd2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
