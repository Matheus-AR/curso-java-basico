package exercicio05.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "maior_posicao"
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		int indiceMaior = 0;
		double maior = vetor[indiceMaior];
		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				indiceMaior = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + String.format("%.2f", maior));
		System.out.print("POSICAO DO MAIOR VALOR = " + indiceMaior);
		
		
		
		sc.close();
	}

}
