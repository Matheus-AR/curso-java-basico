package semoo.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measure of triangle X:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double areaX = 0;
		double pX = 0;
		if (a + b > c || a + c > b || b + c > a) {
			pX = (a + b + c) / 2;
			areaX = Math.sqrt(pX * (pX - a) * (pX - b) * (pX - c));
		}
		System.out.println("Enter the measures of triangle Y:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double areaY = 0;
		double pY = 0;
		if (a + b > c || a + c > b || b + c > a) {
			pY = (a + b + c) / 2;
			areaY = Math.sqrt(pY * (pY - a) * (pY - b) * (pY - c));
		}
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else if (areaX < areaY) {
			System.out.println("Larger area: Y");
		} else {
			System.out.println("Area X = Area Y");
		}
		sc.close();

	}

}
