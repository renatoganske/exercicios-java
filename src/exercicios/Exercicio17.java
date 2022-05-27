package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia as medidas dos lados de um triângulo e escreva
 * se ele é Equilátero, Isósceles ou Escaleno.
 * 
 * @author Ganske
 *
 */
public class Exercicio17 {

	public static void main(String[] args) {

		int edge1, edge2, edge3;
		String triangle;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Para descobrir o tipo do triângulo, informe as 3 medidas. \nPrimeira medida: ");
		edge1 = inputData.nextInt();

		System.out.println("Segunda medida: ");
		edge2 = inputData.nextInt();

		System.out.println("Terceira medida: ");
		edge3 = inputData.nextInt();

		if (edge1 == edge2 && edge2 == edge3) {
			triangle = "equilateral";

		} else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
			triangle = "isósceles";

		} else {
			triangle = "escaleno";
		}

		System.out.printf("Considerando as medidas informadas, trata-se de um triângulo %s.", triangle);
		inputData.close();
	}

}
