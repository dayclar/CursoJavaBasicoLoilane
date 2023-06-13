package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor;

		System.out.print("Informe um número: ");
		valor = scan.nextInt();

		if (valor < 0) {
			System.out.print("O número é negativo");
		} else {
			System.out.print("O número é positivo");
		}
	}
}
