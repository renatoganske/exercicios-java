package exercicios;

import java.util.Scanner;

/**
 * Uma empresa decidiu dar uma gratificação de Natal a seus funcionários,
 * baseada no número de horas extras e no número de horas que o funcionário
 * faltou ao trabalho. O valor do prêmio é obtido pela consulta na tabela a
 * seguir, em que: H = (número de horas extras) – 2/3 * (número de horas-falta)
 * 
 * @author Ganske
 *
 */
public class Exercicio36 {

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);

		int extraTime, faultTime, minutes;
		double bonus;

		System.out.println("Olá! Digite a quantidade de horas extras trabalhadas: ");

		extraTime = (inputData.nextInt()) * 60;

		System.out.println("Digite a quantidade de horas que o funcionário faltou ao trabalho: ");

		faultTime = (inputData.nextInt()) * 60;

		inputData.close();

		minutes = (extraTime - (2 * faultTime / 3));

		if (minutes < 600) {
			bonus = 100.00;

		} else if (minutes <= 1200) {
			bonus = 200.00;

		} else if (minutes <= 1800) {
			bonus = 300.00;

		} else if (minutes <= 2400) {
			bonus = 400.00;

		} else {
			bonus = 500.00;

		}

		System.out.println(
				"A quantidade de horas extras foi de " + (minutes) + ", por esse motivo, seu bônus será de R$" + bonus);

	}

}
