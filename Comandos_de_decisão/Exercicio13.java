package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = scan.nextInt();

		switch (numero) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Terça");
			break;
		case 4:
			System.out.print("Quarta");
			break;
		case 5:
			System.out.print("Quinta");
			break;
		case 6:
			System.out.print("Sexta");
			break;
		case 7:
			System.out.print("Sábado");
			break;
		}
	}
}
