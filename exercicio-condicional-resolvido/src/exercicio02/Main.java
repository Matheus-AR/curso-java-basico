package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = (Math.pow(B, 2)) - (4 * A * C);
		
		
		if (delta < 0.0 || A == 0.0) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = ((-1 * B) + Math.sqrt(delta)) / (2 * A);
			double r2 = ((-1 * B) - Math.sqrt(delta)) / (2 * A);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
