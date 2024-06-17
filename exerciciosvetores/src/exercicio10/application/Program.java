package exercicio10.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio10.entities.Aluno;

/**
 * Problema "aprovados"
 */
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] alunos = new Aluno[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite nome, primeira nota e segunda nota do " + (i+1) + " aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			alunos[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<n; i++) {
			if (alunos[i].calcularMedia() >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}
		
		sc.close();
	}

}
