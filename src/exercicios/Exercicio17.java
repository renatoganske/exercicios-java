package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia as medidas dos lados de um tri�ngulo e escreva
 * se ele � Equil�tero, Is�sceles ou Escaleno.
 * 
 * @author Ganske
 *
 */
public class Exercicio17 {

	public static void main(String[] args) {

		int edge1, edge2, edge3;
		String triangle;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Para descobrir o tipo do tri�ngulo, informe as 3 medidas. \nPrimeira medida: ");
		edge1 = inputData.nextInt();

		System.out.println("Segunda medida: ");
		edge2 = inputData.nextInt();

		System.out.println("Terceira medida: ");
		edge3 = inputData.nextInt();

		if (edge1 == edge2 && edge2 == edge3) {
			triangle = "equilateral";

		} else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
			triangle = "is�sceles";

		} else {
			triangle = "escaleno";
		}

		System.out.printf("Considerando as medidas informadas, trata-se de um tri�ngulo %s.", triangle);
		inputData.close();
	}

}
