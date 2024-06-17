package exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if (salario >= 0.0 && salario <= 2000.0) {
			System.out.println("Isento");
		} else if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} else if(salario <= 4500){
			imposto = 1000 * 0.08 + (salario - 3000) * 0.18;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			imposto = 1000 * 0.08 + (4500 - 3000) * 0.18 + (salario - 4500) * 0.28;
			System.out.printf("R$ %.2f%n", imposto);
		} 
		
		sc.close();
	}

}
