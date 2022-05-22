package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

//Escreva um programa para ler o ano de nascimento de uma pessoa e 
//escrever uma mensagem que diga se ela poderá ou não votar este
//ano (não é necessário considerar o mês em que ela nasceu).
public class Exercicio9 {

	public static void main(String[] args) {

		int birthYear, currentYear, age;

		LocalDate currentDate = LocalDate.now();
		currentYear = currentDate.getYear();

		Scanner inputData = new Scanner(System.in);

		System.out.println("Informe sua data de nascimento: ");
		birthYear = inputData.nextInt();

		age = Math.abs(currentYear - birthYear);
		
		if(age >= 16) {
			System.out.printf("Parabéns! Você tem %d anos, e por isso está apto a votar!", age);
		} else {
			System.out.println("Você ainda não está apto a votar.");
		}

		inputData.close();

	}

}
