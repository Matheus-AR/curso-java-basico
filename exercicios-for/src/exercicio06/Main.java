package exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			if (i != 0) {
				if (N % i == 0) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}

}
