package exercicios;

import java.util.Scanner;

/**
 * Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso,
 * se utiliza do Índice de Massa Corporal (IMC). Sabendo-se que o IMC é
 * calculado através da seguinte fórmula: IMC = peso / altura2 Onde: peso é dado
 * em Kg altura é dada em metros Crie um programa que dados o peso e altura do
 * paciente, exiba sua faixa de risco.
 * 
 * @author Ganske
 *
 */
public class Exercicio33 {

	public static void main(String[] args) {

		double weight, height, imc;
		String condition;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Para calcular o seu IMC, informe seu peso (em kg): ");
		weight = inputData.nextDouble();

		System.out.println("Informe também a sua altura (em m): ");
		height = inputData.nextDouble();

		imc = weight / Math.pow(height, 2);

		if (imc < 20) {
			condition = "abaixo do peso";
		} else if (imc < 25) {
			condition = "com peso normal";
		} else if (imc < 30) {
			condition = "com excesso de peso";
		} else if (imc < 35) {
			condition = "com obesidade";
		} else {
			condition = "com obesidade mórbida";
		}

		System.out.printf("Seu IMC é de %.2f, o que signica que você está %s.", imc, condition);

		inputData.close();
	}

}
