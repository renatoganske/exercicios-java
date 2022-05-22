package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler o número de lados de um polígono regular e a
 * medida do lado (em cm). Calcular e imprimir o seguinte: Se o número de lados
 * for igual a 3 escrever TRIÂNGULO e o valor da área Se o número de lados for
 * igual a 4 escrever QUADRADO e o valor da sua área. Se o número de lados for
 * igual a 5 escrever PENTÁGONO.
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

		System.out.println("Informe o número de lados do polígono: ");
		sides = inputData.nextInt();

		System.out.println("Informe a medida do lado do polígono (em cm): ");
		measure = inputData.nextDouble();

		if (sides == 3) {
			polygon = "triângulo";
			area = (measure * measure) / 2;

		} else if (sides == 4) {
			polygon = "quadrado";
			area = (measure * measure);
			
		} else if (sides == 5) {
			polygon = "pentágono";
			area = (5 * Math.pow(measure, 2)) / (4 * 0.7265);
		}

		System.out.printf("O polígono informado é um %s, cuja área é de %.2fcm².", polygon, area);
		inputData.close();
	}

}
