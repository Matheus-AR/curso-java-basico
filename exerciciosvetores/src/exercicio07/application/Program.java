package exercicio07.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "abaixo_da_media"
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		System.out.println();
		
		double media = soma / vetor.length;
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) System.out.println(vetor[i]);
		}
		sc.close();
	}

}
