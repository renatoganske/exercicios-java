package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
 * Considere que o usuário não informará valores iguais.
 * 
 * @author Ganske
 *
 */
public class Exercicio16 {

	public static void main(String[] args) {

		int num1, num2, num3, higherNumber = 0;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Informe 3 números diferentes para descobrir qual deles é o maior. \nPrimeiro número: ");
		num1 = inputData.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = inputData.nextInt();
		System.out.println("Informe o terceiro número: ");
		num3 = inputData.nextInt();

		if (num1 > num2 && num1 > num3) {
			higherNumber = num1;

		} else if (num2 > num1 && num2 > num3) {
			higherNumber = num2;

		} else {
			higherNumber = num1;
		}

		System.out.printf("%d é o maior número informado.", higherNumber);
		inputData.close();
	}

}