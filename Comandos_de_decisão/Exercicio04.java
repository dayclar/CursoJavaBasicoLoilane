package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letra;

		System.out.print("Informe uma letra: ");
		letra = scan.nextLine();

		switch (letra.toLowerCase()) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.print("A letra é uma vogal");
			break;
		case "b":
		case "c":
		case "d":
		case "f":
		case "g":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "v":
		case "w":
		case "x":
		case "z":
			System.out.print("A letra é uma consoante");
			break;
		}
	}
}
