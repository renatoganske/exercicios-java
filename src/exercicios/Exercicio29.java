package exercicios;

import java.util.Scanner;

/**
 * Desenvolva um programa para determinar a m�dia final e a situa��o (Aprovado,
 * Reprovado ou Exame) de um aluno em uma disciplina. S�o dadas as notas de tr�s
 * provas, o n�mero de aulas ministradas e o n�mero de faltas do aluno. Sabe-se
 * que a m�dia final � a m�dia aritm�tica dessas tr�s provas e que a m�dia para
 * aprova��o � 7, menor do que 3 para reprova��o e as demais em exame.
 * Entretanto, o aluno estar� reprovado se tiver faltado a mais do que 25% das
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

		System.out.println("Ol�! Digite o nome do aluno: ");
		studentName = inputData.next();

		System.out.println("Informe a 1� nota:");
		grade1 = inputData.nextDouble();

		System.out.println("Informe a 2� nota:");
		grade2 = inputData.nextDouble();

		System.out.println("Informe a 3� nota:");
		grade3 = inputData.nextDouble();

		System.out.println("Informe a quantidade de aulas ministradas: ");
		classes = inputData.nextInt();

		System.out.println("Informe a quantidade de faltas: ");
		faultNumber = inputData.nextInt();

		average = (grade1 + grade2 + grade3) / 3;
		frequency = ((classes - faultNumber) * 100) / classes;

		if (average <= 3) {
			System.out.printf(
					"Prezado(a) %s,voc� alcan�ou a frequ�ncia de %.2f%% de aulas assistidas, por�m sua m�dia foi %.2f. Portanto, voc� est� reprovado(a).",
					studentName, frequency, average);
		} else if (frequency <= 25) {
			System.out.printf(
					"Prezado(a) %s, sua m�dia foi $.2f, por�m sua frequ�ncia de %.2f%%. Portanto, voc� est� reprovado(a).",
					studentName, average, frequency);
		} else if (average >= 7) {
			System.out.printf("Prezado %s, sua m�dia foi %.2f, por isso voc� est� aprovado.", studentName, average);
		} else {
			System.out.printf(
					"Prezado(a) %s, voc� alcan�ou a frequ�ncia de %.2f%% de aulas assistidas e sua m�dia foi %.2f. Portanto, voc� est� em exame.",
					studentName, frequency, average);
		}
	}
}