package exercicios;

import java.util.Scanner;

/**
 * Fa�a um programa que receba o sal�rio bruto de um funcion�rio e, usando a
 * tabela a seguir, calcule e mostre o valor a receber. Sabe-se que este �
 * composto pelo sal�rio bruto acrescido de gratifica��o e descontado o imposto
 * de 7% sobre o sal�rio.
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

		System.out.println("Ol�! Digite o sal�rio:");

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
		System.out.println("O sal�rio bruto � de R$" + grossSalary + ". A gratifica��o � de R$" + gratification
				+ ". Considerando que a al�quota de imposto � de 7%, seu sal�rio final � de R$" + finalSalary + ".");

	}

}