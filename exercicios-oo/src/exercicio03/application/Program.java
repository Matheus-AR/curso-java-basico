package exercicio03.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio03.entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.nome = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.notaFinal());
		System.out.print(student.aprovado());
		
		sc.close();
	}

}
