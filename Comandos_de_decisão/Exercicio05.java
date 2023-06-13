package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double nota1, nota2, media;

		System.out.print("Informe  o valor da primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Informe  o valor da segunda nota: ");
		nota2 = scan.nextDouble();

		media = (nota1 + nota2) / 2;
		if (media == 10) {
			System.out.print("Aprovado com Distinção");
		} else if (media < 7) {
			System.out.print("Reprovado");
		} else if (media >= 7) {
			System.out.print("Aprovado");
		}
	}
}
