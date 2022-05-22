package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler o n�mero de lados de um pol�gono regular e a
 * medida do lado (em cm). Calcular e imprimir o seguinte: Se o n�mero de lados
 * for igual a 3 escrever TRI�NGULO e o valor da �rea Se o n�mero de lados for
 * igual a 4 escrever QUADRADO e o valor da sua �rea. Se o n�mero de lados for
 * igual a 5 escrever PENT�GONO.
 * 
 * @author Ganske
 */

public class Exercicio14 {

	public static void main(String[] args) {

		int sides;
		double measure;
		double area = 0;
		String polygon = null;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Informe o n�mero de lados do pol�gono: ");
		sides = inputData.nextInt();

		System.out.println("Informe a medida do lado do pol�gono (em cm): ");
		measure = inputData.nextDouble();

		if (sides == 3) {
			polygon = "tri�ngulo";
			area = (measure * measure) / 2;

		} else if (sides == 4) {
			polygon = "quadrado";
			area = (measure * measure);
			
		} else if (sides == 5) {
			polygon = "pent�gono";
			area = (5 * Math.pow(measure, 2)) / (4 * 0.7265);
		}

		System.out.printf("O pol�gono informado � um %s, cuja �rea � de %.2fcm�.", polygon, area);
		inputData.close();
	}

}
