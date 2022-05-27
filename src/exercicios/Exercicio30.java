package exercicios;

import java.util.Scanner;

/**
 * Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o
 * valor da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%.
 * Desenvolva um programa que dado o valor do produto, imprimir o valor de
 * venda.
 * 
 * @author Ganske
 *
 */
public class Exercicio30 {

	public static void main(String[] args) {

		double purchasePrice, salePrice, profit;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Para calcular o valor de venda, digite o valor de compra do produto: ");

		purchasePrice = inputData.nextDouble();

		if (purchasePrice < 20) {
			profit = 0.45;
		} else {
			profit = 0.3;
		}

		salePrice = purchasePrice + (purchasePrice * profit);

		System.out.printf("O valor de venda do produto é de R$%.2f.", salePrice);

		inputData.close();
	}

}
