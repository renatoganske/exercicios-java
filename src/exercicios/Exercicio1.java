package exercicios;

import java.util.Scanner;

//1. Gratificação de natal (IF)
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);

		int extraTime;
		int faultTime;
		int minutes;
		double bonus;

		System.out.println("Olá! Digite a quantidade de horas extras trabalhadas (em minutos): ");

		extraTime = inputData.nextInt();

		System.out.println("Digite a quantidade de horas que o funcionário faltou ao trabalho (em minutos): ");

		faultTime = inputData.nextInt();

		inputData.close();

		(minutes) = (extraTime) - (2 / 3 * (faultTime));

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
			;
		}

		System.out.println(
				"A quantidade de horas extras foi de " + minutes + ", por esse motivo, seu bônus será de R$" + bonus);
	}

}
