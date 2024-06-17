package versao2.application;

import java.util.Locale;
import java.util.Scanner;

import versao2.util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
		
		sc.close();
	}

}
