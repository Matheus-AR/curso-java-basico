package exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracaoPartida = 0;
		
		if (horaInicial < horaFinal) {
			duracaoPartida = horaFinal - horaInicial;
		} else if (horaInicial > horaFinal) {
			duracaoPartida = 24 - horaInicial + horaFinal;
		} else {
			duracaoPartida = 24;
		}
		
		System.out.println("O JOGO DUROU " + duracaoPartida + " HORA(S)");
		sc.close();
	}

}
