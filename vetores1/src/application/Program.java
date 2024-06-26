package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[3];
		
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		media /= n;
		System.out.printf("AVERAGE HEIGHT = %.2f%n", media);
		
		sc.close();
	}

}
