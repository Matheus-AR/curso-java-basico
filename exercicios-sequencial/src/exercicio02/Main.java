package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.1415;
		
		double raio = sc.nextDouble();
		
		double area = PI * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		sc.close();
	}

}
