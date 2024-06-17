package exercicio04.application;

import java.util.Scanner;

/**
 * Problema "numeros_pares"
 */
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int quantidadesPares = 0;
		
		System.out.println("\nNUMEROS PARES:");
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				
				System.out.print(vetor[i] + "  ");
				quantidadesPares++;
			}
		}
		
		
		System.out.println("\n\nQUANTIDADES DE PARES = " + quantidadesPares);
		
		sc.close();
	}

}
