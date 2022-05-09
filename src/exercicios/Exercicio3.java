package exercicios;

import java.util.Scanner;

//Fa�a um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir.
//Para idade inferior a 5, dever� mostrar mensagem.
public class Exercicio3 {

	public static void main(String[] args) {

		int age;
		String category;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Ol�! Digite uma idade:");

		age = inputData.nextInt();
		
		inputData.close();

		if (age < 5) {
			System.out.println("A idade m�nima � de 5 anos.");
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
				category = "s�nior";
			}

			System.out.println("A idade � de " + age + " anos, por isso a categoria � " + category + ".");
		}

	}
}
