package exercicios;

import java.util.Scanner;

//Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir.
//Para idade inferior a 5, deverá mostrar mensagem.
public class Exercicio3 {

	public static void main(String[] args) {

		int age;
		String category;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Olá! Digite uma idade:");

		age = inputData.nextInt();
		
		inputData.close();

		if (age < 5) {
			System.out.println("A idade mínima é de 5 anos.");
		} else {
			if (age < 7) {
				category = "infantil";
			} else if (age < 10) {
				category = "juvenil";
			} else if (age < 15) {
				category = "adolescente";
			} else if (age < 30) {
				category = "adulto";
			} else {
				category = "sênior";
			}

			System.out.println("A idade é de " + age + " anos, por isso a categoria é " + category + ".");
		}

	}
}
