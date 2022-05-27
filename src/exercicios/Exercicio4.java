package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que receba o salário bruto de um funcionário e, usando a
 * tabela a seguir, calcule e mostre o valor a receber. Sabe-se que este é
 * composto pelo salário bruto acrescido de gratificação e descontado o imposto
 * de 7% sobre o salário.
 * 
 * @author Ganske
 *
 */
public class Exercicio4 {

	public static void main(String[] args) {

		double grossSalary;
		double gratification = 0;
		double totalSalary;
		double finalSalary;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Olá! Digite o salário:");

		grossSalary = inputData.nextDouble();

		inputData.close();

		if (grossSalary < 350) {
			gratification = 100.00;
		} else if (grossSalary < 600) {
			gratification = 75.00;
		} else if (grossSalary < 900) {
			gratification = 50.00;
		}

		totalSalary = grossSalary + gratification;
		finalSalary = totalSalary - (totalSalary * 0.07);
		System.out.println("O salário bruto é de R$" + grossSalary + ". A gratificação é de R$" + gratification
				+ ". Considerando que a alíquota de imposto é de 7%, seu salário final é de R$" + finalSalary + ".");

	}

}