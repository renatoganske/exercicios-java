package exercicios;

import java.util.Scanner;

/**
 * Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:
 * feminino 2: masculino) de uma pessoa, construa um programa que calcule e
 * imprima seu peso ideal, conforme referência oferecida.
 * 
 * @author Ganske
 *
 */
public class Exercicio13 {

	public static void main(String[] args) {

		String gender;
		double height;
		double idealWeight;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Informe o seu sexo (1-Feminino ou 2-Masculino): ");
		gender = inputData.next();

		System.out.println("Informe a sua altura: ");
		height = inputData.nextDouble();

		if (gender.equals("1")) {
			idealWeight = (62.1 * height) - 44.7;

		} else {
			idealWeight = (72.7 * height) - 58;

		}

		System.out.printf("Seu peso ideal é: %.2fkg.", idealWeight);
		inputData.close();
	}

}
