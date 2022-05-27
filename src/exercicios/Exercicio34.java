package exercicios;

import java.util.Scanner;

/**
 * Criar um programa que a partir da idade e peso do paciente calcule a dosagem
 * de determinado medicamento e imprima a receita informando quantas gotas do
 * medicamento o paciente deve tomar por dose. Considere que o medicamento em
 * questão possui 500 mg por ml, e que cada ml corresponde a 20 gotas. Adultos
 * ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de
 * 60 Kg devem tomar 1000 mg; com peso abaixo de 60 Kg devem tomar 875 mg. Para
 * crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso
 * corpóreo conforme a tabela informada.
 * 
 * @author Ganske
 *
 */
public class Exercicio34 {

	public static void main(String[] args) {

		float weight;
		int age, dose = 0, drops;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Para calcular a dose do remédio, informe a idade do paciente (em anos): ");
		age = inputData.nextInt();

		System.out.println("Informe também o peso (em kg): ");
		weight = inputData.nextFloat();

		if (age < 12) {
			if (weight >= 5 && weight <= 9) {
				dose = 125;
			} else if (weight <= 16) {
				dose = 250;
			} else if (weight <= 24) {
				dose = 375;
			} else if (weight < 30) {
				dose = 500;
			} else {
				dose = 750;
			}
		} else if (age > 12) {
			if (weight < 60) {
				dose = 875;
			} else {
				dose = 1000;
			}
		}

		drops = (20 * dose) / 500;

		System.out.printf("O paciente tem %d anos e %.2fkg, portanto precisa tomar %d gotas.", age, weight, drops);
		inputData.close();
	}

}
