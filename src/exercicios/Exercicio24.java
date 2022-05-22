package exercicios;

import java.util.Scanner;

/*
 * Desenvolva um programa que dado um número, informe se ele é divisível por 3 e
 * por 7.
 * 
 * @author Ganske
 *
 */

public class Exercicio24 {

	public static void main(String[] args) {

		int number;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Digite um número para testar se ele é múltiplo de 3 e 7:");

		number = inputData.nextInt();

		if (number % 3 == 0 && number % 7 == 0) {
			System.out.printf("O número %d é múltiplo de 3 e 7.", number);

		} else {
			System.out.printf("O número %d não é múltiplo de 3 e 7.", number);

		}

		inputData.close();
	}
}
