package exercicio11.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio11.entities.Pessoa;


/**
 * Problema "dados_pessoas"
 */
public class Program {

	public static <sysout> void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Altura da " + (i+1) + "a pessoa:");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa:");
			char genero = sc.next().charAt(0);
			
			pessoas[i] = new Pessoa(altura, genero);
		}
		
		double maiorAltura = pessoas[0].getAltura();
		double menorAltura = pessoas[0].getAltura();
		int qtdMulheres = 0;
		int qtdHomens = 0;
		double somaAlturasMulheres = 0.0;
		for (int i=0; i<n; i++) {
			if (pessoas[i].getAltura() > maiorAltura ) {
				maiorAltura = pessoas[i].getAltura();
			}
			
			if (pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
			
			if (pessoas[i].getGenero() == 'F') {
				somaAlturasMulheres += pessoas[i].getAltura();
				qtdMulheres++;
			}
			
			if (pessoas[i].getGenero() == 'M') {
				qtdHomens++;
			}
		}
		
		double mediaAlturaMulheres = somaAlturasMulheres / qtdMulheres;
		
		System.out.println("Menor altura = " + String.format("%.2f", menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulheres));
		System.out.println("Numero de homens = " + qtdHomens);
		sc.close();
	}

}
