package exercicios;

import java.util.Scanner;

/*
 * Desenvolva um programa que dados três números inteiros, informe quantos são
 * negativos.
 * 
 * @author Ganske
 *
 */

public class Exercicio26 {

	public static void main(String[] args) {

		int number1, number2, number3, count = 0;

		Scanner inputData = new Scanner(System.in);

		System.out.println(
				"Informe 3 números inteiros para identificar quantos deles são negativos. Digite o primeiro número: ");
		number1 = inputData.nextInt();

		System.out.println("Digite o segundo número: ");
		number2 = inputData.nextInt();

		System.out.println("Digite o terceiro número: ");
		number3 = inputData.nextInt();

		if (number1 < 0) {
			count++;
		}
		if (number2 < 0) {
			count++;

		}
		if (number3 < 0) {
			count++;
		}

		System.out.printf("Existem %d números negativos.", count);
		inputData.close();
	}
}
