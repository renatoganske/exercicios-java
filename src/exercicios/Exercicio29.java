package exercicios;

import java.util.Scanner;

/**
 * Desenvolva um programa para determinar a média final e a situação (Aprovado,
 * Reprovado ou Exame) de um aluno em uma disciplina. São dadas as notas de três
 * provas, o número de aulas ministradas e o número de faltas do aluno. Sabe-se
 * que a média final é a média aritmética dessas três provas e que a média para
 * aprovação é 7, menor do que 3 para reprovação e as demais em exame.
 * Entretanto, o aluno estará reprovado se tiver faltado a mais do que 25% das
 * aulas.
 * 
 * @author Ganske
 *
 */
public class Exercicio29 {

	public static void main(String[] args) {

		double grade1, grade2, grade3, average, frequency;
		String studentName;
		int classes, faultNumber;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Olá! Digite o nome do aluno: ");
		studentName = inputData.next();

		System.out.println("Informe a 1ª nota:");
		grade1 = inputData.nextDouble();

		System.out.println("Informe a 2ª nota:");
		grade2 = inputData.nextDouble();

		System.out.println("Informe a 3ª nota:");
		grade3 = inputData.nextDouble();

		System.out.println("Informe a quantidade de aulas ministradas: ");
		classes = inputData.nextInt();

		System.out.println("Informe a quantidade de faltas: ");
		faultNumber = inputData.nextInt();

		average = (grade1 + grade2 + grade3) / 3;
		frequency = ((classes - faultNumber) * 100) / classes;

		if (average <= 3) {
			System.out.printf(
					"Prezado(a) %s,você alcançou a frequência de %.2f%% de aulas assistidas, porém sua média foi %.2f. Portanto, você está reprovado(a).",
					studentName, frequency, average);
		} else if (frequency <= 25) {
			System.out.printf(
					"Prezado(a) %s, sua média foi $.2f, porém sua frequência de %.2f%%. Portanto, você está reprovado(a).",
					studentName, average, frequency);
		} else if (average >= 7) {
			System.out.printf("Prezado %s, sua média foi %.2f, por isso você está aprovado.", studentName, average);
		} else {
			System.out.printf(
					"Prezado(a) %s, você alcançou a frequência de %.2f%% de aulas assistidas e sua média foi %.2f. Portanto, você está em exame.",
					studentName, frequency, average);
		}
	}
}