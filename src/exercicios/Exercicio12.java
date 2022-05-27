package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler 3 valores inteiros (considere que n�o ser�o
 * lidos valores iguais) e escrev�-los em ordem crescente.
 * 
 * @author Ganske
 *
 */
public class Exercicio12 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Informe 3 n�meros diferentes para serem ordenados em ordem crescente. \nPrimeiro n�mero: ");
		num1 = inputData.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = inputData.nextInt();
		System.out.println("Informe o terceiro n�mero: ");
		num3 = inputData.nextInt();

		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.printf("%d %d %d", num1, num2, num3);
			} else {
				System.out.printf("%d %d %d", num1, num3, num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.printf("%d %d %d", num2, num1, num3);
			} else {
				System.out.printf("%d %d %d", num2, num3, num1);
			}

		} else if (num3 < num1 && num3 < num2) {
			if (num1 < num2) {
				System.out.printf("%d %d %d", num3, num1, num2);
			} else {
				System.out.printf("%d %d %d", num3, num2, num1);
			}
		}

		inputData.close();
	}
}