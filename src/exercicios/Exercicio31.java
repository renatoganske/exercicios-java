package exercicios;

import java.util.Scanner;

/**
 * Depois da libera��o do governo para as mensalidades dos planos de sa�de, as
 * pessoas come�aram a fazer pesquisas para descobrir um bom plano, n�o muito
 * caro. Um vendedor de um plano de sa�de apresentou a tabela a seguir.
 * Desenvolva um programa que dada a idade de uma pessoa, imprima o valor que
 * ela dever� pagar.
 * 
 * @author Ganske
 *
 */

public class Exercicio31 {

	public static void main(String[] args) {

		int age;
		double monthlyPayment;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Ol�! Para saber o valor da mensalidade do seu plano de sa�de, digite sua idade: ");

		age = inputData.nextInt();

		if (age <= 10) {
			monthlyPayment = 30.0;
		} else if (age <= 29) {
			monthlyPayment = 60.0;
		} else if (age <= 45) {
			monthlyPayment = 120.0;
		} else if (age <= 59) {
			monthlyPayment = 150.0;
		} else if (age <= 65) {
			monthlyPayment = 250.0;
		} else {
			monthlyPayment = 400.0;
		}

		System.out.printf(
				"Considerando que voc� tem %d anos, o valor da mensalidade do seu plano de sa�de � de R$%.2f.", age,
				monthlyPayment);

		inputData.close();

	}

}
