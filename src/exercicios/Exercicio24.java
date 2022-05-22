package exercicios;

import java.util.Scanner;

/*
 * Desenvolva um programa que dado um n�mero, informe se ele � divis�vel por 3 e
 * por 7.
 * 
 * @author Ganske
 *
 */

public class Exercicio24 {

	public static void main(String[] args) {

		int number;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Digite um n�mero para testar se ele � m�ltiplo de 3 e 7:");

		number = inputData.nextInt();

		if (number % 3 == 0 && number % 7 == 0) {
			System.out.printf("O n�mero %d � m�ltiplo de 3 e 7.", number);

		} else {
			System.out.printf("O n�mero %d n�o � m�ltiplo de 3 e 7.", number);

		}

		inputData.close();
	}
}
