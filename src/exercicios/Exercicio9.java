package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

//Escreva um programa para ler o ano de nascimento de uma pessoa e 
//escrever uma mensagem que diga se ela poder� ou n�o votar este
//ano (n�o � necess�rio considerar o m�s em que ela nasceu).
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
			System.out.printf("Parab�ns! Voc� tem %d anos, e por isso est� apto a votar!", age);
		} else {
			System.out.println("Voc� ainda n�o est� apto a votar.");
		}

		inputData.close();

	}

}
