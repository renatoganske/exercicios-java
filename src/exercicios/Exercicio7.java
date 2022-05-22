package exercicios;

import java.util.Scanner;

//Fa�a um programa que leia um conjunto n�o determinado de valores e
//mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada.
//Finalize a entrada de dados com um valor negativo ou zero.
public class Exercicio7 {

	public static void main(String[] args) {

		int number;
		double squared = 2, cubed = 3, numberSquared = 0, numberCubed = 0, numberSquareRoot = 0;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");

		number = inputData.nextInt();

		while (number > 0) {

			numberSquared = Math.pow(number, squared);
			numberCubed = Math.pow(number, cubed);
			numberSquareRoot = Math.sqrt(number);

			System.out.println("O n�mero digitado foi: " + number);
			System.out.println("O quadrado do n�mero �: " + numberSquared);
			System.out.println("O cubo do n�mero �: " + numberCubed);
			System.out.println("A raiz quadrada do n�mero �: " + numberSquareRoot);
			System.out.println("");

			System.out.print("Para sair ditige 0 ou um n�mero negativo, para continuar digite um n�mero positivo: \n");

			number = inputData.nextInt();

			if (number <= 0) {

				System.out.println("Programa finalizado.");
			}
		}

		inputData.close();
	}
}
