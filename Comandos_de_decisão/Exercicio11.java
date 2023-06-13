package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double slInicial, slFinal = 0, vlAumento = 0;
		int perc = 0;

		System.out.print("Informe o  salário: ");
		slInicial = scan.nextDouble();

		if (slInicial <= 280) {
			slFinal = slInicial * 1.20;
			vlAumento = slInicial * 0.20;
			perc = 20;
		} else if (slInicial > 280 && slInicial <= 700) {
			slFinal = slInicial * 1.15;
			vlAumento = slInicial * 0.15;
			perc = 15;
		} else if (slInicial > 700 && slInicial <= 1500) {
			slFinal = slInicial * 1.10;
			vlAumento = slInicial * 0.10;
			perc = 10;
		} else if (slInicial > 1500) {
			slFinal = slInicial * 1.05;
			vlAumento = slInicial * 0.05;
			perc = 5;
		}

		System.out.printf(
				"\nSalário antes do reajuste: %.2f\nPercentual de aumento aplicado: %d%%\n"
						+ "Valor do aumento: %.2f\nNovo salário após o aumneto: %.2f",
				slInicial, perc, vlAumento, slFinal);
	}
}
