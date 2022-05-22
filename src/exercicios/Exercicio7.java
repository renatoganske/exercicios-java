package exercicios;

import java.util.Scanner;

//Faça um programa que leia um conjunto não determinado de valores e
//mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada.
//Finalize a entrada de dados com um valor negativo ou zero.
public class Exercicio7 {

	public static void main(String[] args) {

		int number;
		double squared = 2, cubed = 3, numberSquared = 0, numberCubed = 0, numberSquareRoot = 0;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Digite um número: ");

		number = inputData.nextInt();

		while (number > 0) {

			numberSquared = Math.pow(number, squared);
			numberCubed = Math.pow(number, cubed);
			numberSquareRoot = Math.sqrt(number);

			System.out.println("O número digitado foi: " + number);
			System.out.println("O quadrado do número é: " + numberSquared);
			System.out.println("O cubo do número é: " + numberCubed);
			System.out.println("A raiz quadrada do número é: " + numberSquareRoot);
			System.out.println("");

			System.out.print("Para sair ditige 0 ou um número negativo, para continuar digite um número positivo: \n");

			number = inputData.nextInt();

			if (number <= 0) {

				System.out.println("Programa finalizado.");
			}
		}

		inputData.close();
	}
}
