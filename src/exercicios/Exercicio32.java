package exercicios;

import java.util.Scanner;

/**
 * Crie um programa que possa entrar com o valor da compra e imprimir o valor da venda.
 * @author Ganske
 *
 */
public class Exercicio32 {

	public static void main(String[] args) {

		double purchasePrice, salePrice, profit;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Para calcular o valor de venda, digite o valor de compra do produto: ");

		purchasePrice = inputData.nextDouble();

		if (purchasePrice < 10) {
			profit = 0.7;
		} else if (purchasePrice < 30) {
			profit = 0.5;
		} else if (purchasePrice < 50) {
			profit = 0.4;
		} else {
			profit = 0.3;
		}
		
		salePrice = purchasePrice + (purchasePrice * profit);

		System.out.printf("O valor de venda do produto é de R$%.2f.", salePrice);

		inputData.close();
	}

}