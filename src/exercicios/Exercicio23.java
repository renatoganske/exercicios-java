package exercicios;

import java.util.Scanner;

/**
 * Desenvolva um programa que dado um n�mero, imprima uma das mensagens: �
 * m�ltiplo de 3 ou n�o � m�ltiplo de 3.
 * 
 * @author Ganske
 *
 */
public class Exercicio23 {

	public static void main(String[] args) {

		int number;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Digite um n�mero para testar se ele � m�ltiplo de 3 ou n�o:");

		number = inputData.nextInt();

		if (number % 3 == 0) {
			System.out.printf("O n�mero %d � m�ltiplo de 3.", number);

		} else {
			System.out.printf("O n�mero %d n�o � m�ltiplo de 3.", number);

		}

		inputData.close();
	}
}
