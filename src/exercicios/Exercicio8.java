package exercicios;

import java.util.Scanner;

//Escreva um programa para ler 2 valores (considere que não serão
//informados valores iguais) e escrever o maior deles.
public class Exercicio8 {

	public static void main(String[] args) {

		int number1, number2;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Informe o 1º número: ");
		number1 = inputData.nextInt();

		System.out.println("Informe o 2º número: ");
		number2 = inputData.nextInt();

		if (number1 > number2) {
			System.out.printf("Os números informados foram %d e %d, portanto o maior deles é o número %d.", number1,
					number2, number1);
		} else {
			System.out.printf("Os números informados foram %d e %d, portanto o maior deles é o número %d.", number1,
					number2, number2);
		}

		inputData.close();
	}

}
