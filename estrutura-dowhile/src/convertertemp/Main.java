package convertertemp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char repetir;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double tempC = sc.nextDouble();
			double converterParaF = ((9 * tempC) / 5) + 32;
			System.out.printf("Equivalente em Farenheit: %.1f%n", converterParaF);
			System.out.print("Deseja repetir (s/n)? ");
			repetir = sc.next().charAt(0);
			
		}while (repetir != 'n');
		
		sc.close();
	}
}
