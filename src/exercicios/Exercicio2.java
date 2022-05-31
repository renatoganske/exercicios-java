package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a
 * tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se
 * encaixa.
 * 
 * @author Ganske
 *
 */
public class Exercicio2 {

	public static void main(String[] args) {

		int age;
		int weight;
		int risk;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Olá! Digite a sua idade:");

		age = inputData.nextInt();

		System.out.println("Digite o seu peso(kg):");

		weight = inputData.nextInt();

		inputData.close();

		if (age < 20) {
			if (weight < 60) {
				risk = 9;
			} else if (weight < 90) {
				risk = 8;
			} else {
				risk = 7;
			}
		} else if (age < 50) {
			if (weight < 60) {
				risk = 6;
			} else if (weight < 90) {
				risk = 5;
			} else {
				risk = 4;
			}
		} else {
			if (weight < 60) {
				risk = 3;
			} else if (weight < 90) {
				risk = 2;
			} else {
				risk = 1;
			}
		}

		System.out.println("Você tem " + age + " anos e " + weight + ("kg. O seu risco é: " + risk + "."));
	}
}
