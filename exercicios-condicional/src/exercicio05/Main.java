package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0.0;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		if (codigo == 2) {
			total = quantidade * 4.5;
		}
		if (codigo == 3) {
			total = quantidade * 5.0;
		}
		if (codigo == 4) {
			total = quantidade * 2.0;
		}
		if (codigo == 5) {
			total = quantidade * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
