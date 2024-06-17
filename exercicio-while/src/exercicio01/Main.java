package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int senhaCerta = 2002;
		int senha = sc.nextInt();
		
		while (senha != senhaCerta) {
			System.out.println("Senha Invalida");
			
			senha = sc.nextInt();
		}
		
		if (senha == senhaCerta) {
			System.out.println("Acesso Permitido");
		}
		
		sc.close();
	}

}
