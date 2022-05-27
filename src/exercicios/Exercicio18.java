package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva
 * se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
 * 
 * @author Ganske
 *
 */
public class Exercicio18 {

	public static void main(String[] args) {

		int angle1, angle2, angle3;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Para descobrir o tipo do triângulo, informe os 3 ângulos. \nPrimeiro ângulo: ");
		angle1 = inputData.nextInt();

		System.out.println("Segundo ângulo: ");
		angle2 = inputData.nextInt();

		System.out.println("Terceiro ângulo: ");
		angle3 = inputData.nextInt();

		if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
			System.out.println("Triângulo Retângulo: possui um ângulo reto. (igual a 90°).");
		} else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
			System.out.println("Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90°).");
		} else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
			System.out.println("TriânguloAcutângulo: possui três ângulos agudos. (menor que 90°).");
		}
		inputData.close();
	}

}
