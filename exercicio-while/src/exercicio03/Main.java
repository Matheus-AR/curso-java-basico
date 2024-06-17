package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tipoCombustivel = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(tipoCombustivel != 4) {
			if (tipoCombustivel == 1) {
				alcool += 1;
			}
			
			if (tipoCombustivel == 2) {
				gasolina += 1;
			}
			
			if (tipoCombustivel == 3) {
				diesel += 1;
			}
			
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
