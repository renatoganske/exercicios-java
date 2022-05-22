package exercicios;

import java.util.Scanner;

//As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que
//leia o número de maçãs compradas, calcule e escreva o valor total da compra.
public class Exercicio11 {

	public static void main(String[] args) {

		int applesAmount;
		double wholesale = 0.25;
		double retail = 0.30;
		double totalValue;

		Scanner inputData = new Scanner(System.in);
		System.out.println("Informe a quantidade de maçãs compradas: ");
		applesAmount = inputData.nextInt();

		if (applesAmount < 12) {
			totalValue = applesAmount * retail;
			System.out.printf("Foram compradas %d maçãs, totalizando no valor de R$%.2f.", applesAmount, totalValue);
		} else {
			totalValue = applesAmount * wholesale;
			System.out.printf("Foram compradas %d maçãs, totalizando no valor de R$%.2f.", applesAmount, totalValue);
		}

		inputData.close();
	}

}
