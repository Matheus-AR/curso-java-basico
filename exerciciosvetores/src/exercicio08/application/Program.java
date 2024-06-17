package exercicio08.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "media_pares"
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int qtdPares = 0;
		for (int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtdPares++;
			}
		}
		double media = (double) soma / qtdPares;
		if (qtdPares > 0) {
			System.out.println("NUMEROS PARES = " + String.format("%.1f", media));
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}
