package exercicio02.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema "soma_vetor"
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = sc.nextInt();
		
		double[] vetor = new double[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			vetor[i] = numero;
		}
		
		double soma = 0.0;
		
		System.out.println("");
		System.out.print("VALORES = ");
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		
		double media = soma / quantidade;

		System.out.println();
		
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();
	}

}
