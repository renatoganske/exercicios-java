package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia o valor de 3 �ngulos de um tri�ngulo e escreva
 * se o tri�ngulo � Acut�ngulo, Ret�ngulo ou Obtus�ngulo.
 * 
 * @author Ganske
 *
 */
public class Exercicio18 {

	public static void main(String[] args) {

		int angle1, angle2, angle3;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Para descobrir o tipo do tri�ngulo, informe os 3 �ngulos. \nPrimeiro �ngulo: ");
		angle1 = inputData.nextInt();

		System.out.println("Segundo �ngulo: ");
		angle2 = inputData.nextInt();

		System.out.println("Terceiro �ngulo: ");
		angle3 = inputData.nextInt();

		if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
			System.out.println("Tri�ngulo Ret�ngulo: possui um �ngulo reto. (igual a 90�).");
		} else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
			System.out.println("Tri�ngulo Obtus�ngulo: possui um �ngulo obtuso. (maior que 90�).");
		} else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
			System.out.println("Tri�nguloAcut�ngulo: possui tr�s �ngulos agudos. (menor que 90�).");
		}
		inputData.close();
	}

}
