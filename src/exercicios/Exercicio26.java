package exercicios;

import java.util.Scanner;

/*
 * Desenvolva um programa que dados tr�s n�meros inteiros, informe quantos s�o
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
				"Informe 3 n�meros inteiros para identificar quantos deles s�o negativos. Digite o primeiro n�mero: ");
		number1 = inputData.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		number2 = inputData.nextInt();

		System.out.println("Digite o terceiro n�mero: ");
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

		System.out.printf("Existem %d n�meros negativos.", count);
		inputData.close();
	}
}
