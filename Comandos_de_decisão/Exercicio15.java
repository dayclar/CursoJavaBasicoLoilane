package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double l[] = new double[3];
		System.out.print("Informe o valor do primeiro lado:");
		l[0] = scan.nextDouble();
		System.out.print("Informe o valor do segundo lado:");
		l[1] = scan.nextDouble();
		System.out.print("Informe o valor do terceiro lado:");
		l[2] = scan.nextDouble();

		if ((l[1] - l[2] < l[0] && l[1] + l[2] > l[0]) && (l[0] - l[2] < l[1] && l[0] + l[2] > l[1])
				&& (l[0] - l[1] < l[2] && l[0] + l[1] > l[2])) {
			if (l[0] == l[1] && l[0] == l[2] && l[1] == l[2]) {
				System.out.print("Triângulo Equilátero"); 
			} else if (l[0] == l[1] || l[0] == l[2] || l[1] == l[2]) {
				System.out.print("Triângulo Isósceles");
			} else if (l[0] != l[1] && l[0] != l[2] && l[1] != l[2]) {
				System.out.print("Triângulo Escaleno");
			}
		} else {
			System.out.print("Os valores não formam triângulo");
		}
	}
}

