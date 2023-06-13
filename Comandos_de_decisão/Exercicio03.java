package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letra;
		
		System.out.print("Informe o sexo sendo F ou M: ");
		letra = scan.nextLine();
		
		switch (letra) {
		case "F":
		case "f":
			System.out.print("F - Feminino");
			break;
		case "M":
		case "m":
			System.out.print("M - Masculino");
			break;
		default:
			System.out.print("Sexo inválido");
		}
	}
}
