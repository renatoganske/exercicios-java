package exercicios;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);

		double factoryCost, finalValue, distributorPercentage, tax;

		System.out.println("Informe o valor de fábrica do veículo: ");
		factoryCost = inputData.nextDouble();

		if (factoryCost < 12000.00) {
			distributorPercentage = 0.05;
			tax = 0;

		} else if (factoryCost < 25000.00) {
			distributorPercentage = 0.10;
			tax = 0.15;

		} else {
			distributorPercentage = 0.15;
			tax = 0.20;
		}
		
		finalValue = factoryCost + (factoryCost * distributorPercentage) + (factoryCost * tax);
		
		System.out.printf("O valor para o consumidor é de R$ %.2f", finalValue);

		inputData.close();
	}

}
