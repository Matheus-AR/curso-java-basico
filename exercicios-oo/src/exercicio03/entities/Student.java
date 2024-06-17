package exercicio03.entities;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovado() {
		if (notaFinal() >= 60) {
			return "PASS";
		} else {
			return "FAILED"
					+ "\nMISSING: "
					+ String.format("%.2f", (60 - notaFinal()));
		}
	}
	
	public String toString() {
		return nome
				+ ",\nNota1: "
				+ nota1
				+ ", \nNota2:"
				+ nota2
				+ ", \nNota3: "
				+ nota3;
	}
}
