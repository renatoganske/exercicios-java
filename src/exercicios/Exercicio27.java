package exercicios;

import java.util.Scanner;

/*
 * Desenvolva um programa que dada a idade de uma pessoa, determine 
 * sua condição de eleitor conforme a tabela informada no problema.
 * @author Ganske
 *
 */

public class Exercicio27 {

	public static void main(String[] args) {

		int age;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		age = inputData.nextInt();

		if (age < 16) {
			System.out.println("Não pode votar.");
		} else if (age >= 18 && age < 64) {
			System.out.printf("Obrigatório");
		} else {
			System.out.println("Facultativo.");
		}

		inputData.close();

	}

}
