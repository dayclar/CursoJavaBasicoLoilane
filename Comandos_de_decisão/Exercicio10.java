package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String turno;

		System.out.print("Informe o turno: \nM-matutino\nV-Vespertino\nN- Noturno\n");
		turno = scan.nextLine();

		if (turno.equalsIgnoreCase("M")) {
			System.out.print("Bom dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.print("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.print("Boa noite!");
		} else {
			System.out.print("Valor inválido");
		}
	}
}
