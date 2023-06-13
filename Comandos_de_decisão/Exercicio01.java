package exerciciosComandoDecisao;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		System.out.print("Informe outro número: ");
		int num2 = scan.nextInt();

		if (num > num2) {
			System.out.print(num);
		} else if (num2 > num) {
			System.out.print(num2);
		}
	}
}
