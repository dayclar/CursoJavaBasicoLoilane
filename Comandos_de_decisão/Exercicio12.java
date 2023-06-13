package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio12 {
	public static void imprimirIsento(double slBruto, int qtdHoras, double vlHoras) {
		double INSS = 0, FGTS = 0, totDesc = 0, sLiquido = 0;

		INSS = slBruto * 0.10;
		FGTS = slBruto * 0.11;
		totDesc = INSS;
		sLiquido = slBruto - totDesc;
		System.out.printf("\nSalário bruto: (%.2f * %d)\t: R$ %.2f", vlHoras, qtdHoras, slBruto);
		System.out.printf("\n(-) IR (Isento) \t\t: RS 0,00");
		System.out.printf("\n(-) INSS (10%%) \t\t\t: RS %.2f", INSS);
		System.out.printf("\nFGTS (11%%) \t\t\t: R$ %.2f", FGTS);
		System.out.printf("\nTotal de descontos \t\t: R$ %.2f", totDesc);
		System.out.printf("\nSalário liquido \t\t: R$ %.2f", sLiquido);
	}

	public static void imprimir(double slBruto, int qtdHoras, double vlHoras, double vlIR, int percIR) {
		double IR = 0, INSS = 0, FGTS = 0, totDesc = 0, sLiquido = 0;

		IR = slBruto * vlIR;
		INSS = slBruto * 0.10;
		FGTS = slBruto * 0.11;
		totDesc = INSS + IR;
		sLiquido = slBruto - totDesc;
		System.out.printf("\nSalário bruto: (%.2f * %d)\t: R$ %.2f", vlHoras, qtdHoras, slBruto);
		System.out.printf("\n(-) IR (%d%%) \t\t\t: RS %.2f", percIR, IR);
		System.out.printf("\n(-) INSS (10%%) \t\t\t: RS %.2f", INSS);
		System.out.printf("\nFGTS (11%%) \t\t\t: R$ %.2f", FGTS);
		System.out.printf("\nTotal de descontos \t\t: R$ %.2f", totDesc);
		System.out.printf("\nSalário liquido \t\t: R$ %.2f", sLiquido);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		int qtdHoras = scan.nextInt();
		System.out.print("Informe o valor da hora: ");
		double vlHoras = scan.nextDouble();

		double slBruto = qtdHoras * vlHoras;
		if (slBruto <= 900) {
			imprimirIsento(slBruto, qtdHoras, vlHoras);

		} else if (slBruto > 900 && slBruto <= 1500) {
			imprimir(slBruto, qtdHoras, vlHoras, 0.05, 5);

		} else if (slBruto > 1500 && slBruto <= 2500) {
			imprimir(slBruto, qtdHoras, vlHoras, 0.10, 10);

		} else if (slBruto > 2500) {
			imprimir(slBruto, qtdHoras, vlHoras, 0.20, 20);

		}
	}
}
