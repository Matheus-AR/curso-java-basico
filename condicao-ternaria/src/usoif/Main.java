package usoif;

public class Main {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		System.out.printf("Desconto = %.2f%n", desconto);
	}

}
