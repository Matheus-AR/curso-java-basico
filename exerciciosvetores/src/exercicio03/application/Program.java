package exercicio03.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio03.entities.Pessoa;

/**
 * Problema "alturas"
 */
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantidade = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[quantidade];
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + " pessoa:");
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0.0;
		int menores16 = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			// somando as alturas para fazer a média depois
			soma += pessoas[i].getAltura();
			
			// contando as pessoas menores de 16 anos
			if (pessoas[i].getIdade() < 16) {
				menores16++;
			}
		}
		
		double media = soma / pessoas.length;
		double porcentagemMenos16 = (double)(100 * menores16 / pessoas.length);
		
		System.out.println();
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", porcentagemMenos16);
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
				
		
		}
		
		sc.close();
	}

}
