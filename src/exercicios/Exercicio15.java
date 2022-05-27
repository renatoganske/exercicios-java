package exercicios;

import java.util.Scanner;

/**
 * Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. Caso o
 * número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
 * 
 * @author Ganske
 *
 */
public class Exercicio15 {

	public static void main(String[] args) {

		int sides;
		double measure, area = 0;
		String polygon = null;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Informe o número de lados do polígono: ");
		sides = inputData.nextInt();

		System.out.println("Informe a medida do lado do polígono (em cm): ");
		measure = inputData.nextDouble();

		if (sides == 3 || sides == 4 || sides == 5) {
			if (sides == 3) {
				polygon = "triângulo";
				area = (measure * measure) / 2;

			} else if (sides == 4) {
				polygon = "quadrado";
				area = (measure * measure);

			} else if (sides == 5) {
				polygon = "pentágono";
				area = (5 * Math.pow(measure, 2)) / (4 * 07265);
			}
			System.out.printf("O polígono informado é um %s, cuja área é de %.2fcm².", polygon, area);

		} else if (sides < 3) {
			System.out.println("Não é um polígono.");

		} else {
			System.out.println("Polígono não identificado.");
		}

		inputData.close();
	}

}
