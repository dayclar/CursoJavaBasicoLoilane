package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double nota1, nota2, media;
		String conceito = null, situacao = null;

		System.out.print("Informe a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota2 = scan.nextDouble();

		media = (nota1 + nota2) / 2;
		if (media >= 0 && media <= 4) {
			conceito = "E";
			situacao = "REPROVADO";
		} else if (media > 4 && media <= 6) {
			conceito = "D";
			situacao = "REPROVADO";
		} else if (media > 6 && media <= 7.5) {
			conceito = "C";
			situacao = "APROVADO";
		} else if (media > 7.5 && media <= 9) {
			conceito = "B";
			situacao = "APROVADO";
		} else if (media > 9 && media <= 10) {
			conceito = "A";
			situacao = "APROVADO";
		}
		System.out.printf("\nPrimeira nota: %.1f\nsegunda nota: %.1f", nota1, nota2);
		System.out.printf("\nMédia do aluno: %.1f\nConceito: %s\nSituação: %s", media, conceito, situacao);
	}
}
