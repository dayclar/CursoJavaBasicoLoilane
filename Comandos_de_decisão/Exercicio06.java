package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[3];

		System.out.print("Informe o primeiro número: ");
		n[0] = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		n[1] = scan.nextInt();
		System.out.print("Informe o terceiro número: ");
		n[2] = scan.nextInt();

		if (n[0] > n[1] && n[0] > n[2]) {
			System.out.println("\nO maior número é o: " + n[0]);
		} else if (n[1] > n[0] && n[1] > n[2]) {
			System.out.println("\nO maior número é o: " + n[1]);
		} else if (n[2] > n[0] && n[2] > n[1]) {
			System.out.println("\nO maior número é o: " + n[2]);
		}
	}
}
