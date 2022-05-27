package exercicios;

import java.util.Scanner;

/**
 * Depois da liberação do governo para as mensalidades dos planos de saúde, as
 * pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito
 * caro. Um vendedor de um plano de saúde apresentou a tabela a seguir.
 * Desenvolva um programa que dada a idade de uma pessoa, imprima o valor que
 * ela deverá pagar.
 * 
 * @author Ganske
 *
 */

public class Exercicio31 {

	public static void main(String[] args) {

		int age;
		double monthlyPayment;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Olá! Para saber o valor da mensalidade do seu plano de saúde, digite sua idade: ");

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
				"Considerando que você tem %d anos, o valor da mensalidade do seu plano de saúde é de R$%.2f.", age,
				monthlyPayment);

		inputData.close();

	}

}
