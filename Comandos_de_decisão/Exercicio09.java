package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio09 {
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
			System.out.print("\n" + n[0]);
		} else if (n[1] > n[0] && n[1] > n[2]) {
			System.out.print("\n" + n[1]);
		} else if (n[2] > n[0] && n[2] > n[1]) {
			System.out.print("\n" + n[2]);
		}

		if (n[0] > n[1] && n[0] < n[2]) {
			System.out.print("\n" + n[0]);
		} else if (n[0] > n[2] && n[0] < n[1]) {
			System.out.print("\n" + n[0]);
		}

		if (n[1] > n[0] && n[1] < n[2]) {
			System.out.print("\n" + n[1]);
		} else if (n[1] > n[2] && n[1] < n[0]) {
			System.out.print("\n" + n[1]);
		}

		if (n[2] > n[0] && n[2] < n[1]) {
			System.out.print("\n" + n[2]);
		} else if (n[2] > n[1] && n[0] < n[0]) {
			System.out.print("\n" + n[2]);
		}

		if (n[0] < n[1] && n[0] < n[2]) {
			System.out.print("\n" + n[0]);
		} else if (n[1] < n[0] && n[1] < n[2]) {
			System.out.print("\n" + n[1]);
		} else if (n[2] < n[0] && n[2] < n[1]) {
			System.out.print("\n" + n[2]);
		}
	}
}
