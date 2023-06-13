package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] n = new double[3];

		System.out.print("Informe o preço do primeiro produto: ");
		n[0] = scan.nextDouble();
		System.out.print("Informe o preço do segundo produto: ");
		n[1] = scan.nextDouble();
		System.out.print("Informe o preço do terceiro produto: ");
		n[2] = scan.nextDouble();

		if (n[0] < n[1] && n[0] < n[2]) {
			System.out.print("\nVocê deve comprar o produto 1");
		} else if (n[1] < n[0] && n[1] < n[2]) {
			System.out.print("\nVocê deve comprar o produto 2");
		} else if (n[2] < n[0] && n[2] < n[1]) {
			System.out.print("\nVocê deve comprar o produto 3");
		}
	}
}