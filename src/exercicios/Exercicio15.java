package exercicios;

import java.util.Scanner;

/**
 * Acrescente as seguintes mensagens � solu��o da tarefa 14 conforme o caso.
 * Caso o n�mero de lados seja inferior a 3 escrever N�O � UM POL�GONO. Caso o
 * n�mero de lados seja superior a 5 escrever POL�GONO N�O IDENTIFICADO.
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

		System.out.println("Informe o n�mero de lados do pol�gono: ");
		sides = inputData.nextInt();

		System.out.println("Informe a medida do lado do pol�gono (em cm): ");
		measure = inputData.nextDouble();

		if (sides == 3 || sides == 4 || sides == 5) {
			if (sides == 3) {
				polygon = "tri�ngulo";
				area = (measure * measure) / 2;

			} else if (sides == 4) {
				polygon = "quadrado";
				area = (measure * measure);

			} else if (sides == 5) {
				polygon = "pent�gono";
				area = (5 * Math.pow(measure, 2)) / (4 * 07265);
			}
			System.out.printf("O pol�gono informado � um %s, cuja �rea � de %.2fcm�.", polygon, area);

		} else if (sides < 3) {
			System.out.println("N�o � um pol�gono.");

		} else {
			System.out.println("Pol�gono n�o identificado.");
		}

		inputData.close();
	}

}
