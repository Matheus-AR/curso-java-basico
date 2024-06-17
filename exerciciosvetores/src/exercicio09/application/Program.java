package exercicio09.application;

import java.util.Scanner;

import exercicio09.entities.Pessoa;

/**
 * Problema "mais_velho"
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + " pessoa:");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		Pessoa maisVelho = pessoas[0];
		for (int i=0; i<n; i++) {
			if (pessoas[i].getIdade() > maisVelho.getIdade()) {
				maisVelho = pessoas[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + maisVelho.getNome());
		
		sc.close();
	}

}
