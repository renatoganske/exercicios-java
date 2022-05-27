package exercicios;

import java.util.Scanner;

/**
 * Desenvolva um programa que dado um número, imprima uma das mensagens: é
 * múltiplo de 3 ou não é múltiplo de 3.
 * 
 * @author Ganske
 *
 */
public class Exercicio23 {

	public static void main(String[] args) {

		int number;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Digite um número para testar se ele é múltiplo de 3 ou não:");

		number = inputData.nextInt();

		if (number % 3 == 0) {
			System.out.printf("O número %d é múltiplo de 3.", number);

		} else {
			System.out.printf("O número %d não é múltiplo de 3.", number);

		}

		inputData.close();
	}
}
