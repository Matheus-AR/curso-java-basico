package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A < B && B % A == 0) {
			System.out.println("Sao Multiplos");
		} else if (A > B && A % B == 0) {
			System.out.println("Sao Miltiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}

}
