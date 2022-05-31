package exercicios;

import java.util.Scanner;

/**
 * Uma empresa possui dez funcionários com as seguintes características: código,
 * número de horas trabalhadas no mês, turno de trabalho (M – matutino; V –
 * vespertino; N – noturno), categoria (O – operário; ou G – gerente), valor da
 * hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de
 * pagamento, faça um programa que: a) Leia as informações dos funcionários,
 * exceto o valor da hora trabalhada, não permitindo que sejam informações dos
 * turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de
 * letras maiúsculas; b) Calcule o valor da hora trabalhada, conforme a tabela
 * 1. Adote o valor de R$450,00 para o salário mínimo; c) Calcule o salário
 * inicial dos funcionários com base no valor da hora trabalhada e no número de
 * horas trabalhadas; d) Calcule o valor do auxílio alimentação recebido pelo
 * funcionário de acordo com seu salário inicial, conforme a tabela 2; e) Mostre
 * o código, número de horas trabalhadas, valor da hora trabalhada, salário
 * inicial, auxílio alimentação e salário final (salário inicial + auxílio
 * alimentação).
 * 
 * @author Ganske
 *
 */

public class Exercicio5 {

	static double basicSalary = 450.0;

	public static void main(String[] args) {
		int employeesNumber = 10;
		int[] code = new int[10];

		Scanner inputData = new Scanner(System.in);

		for (int id = 0; id < employeesNumber; id++) {
			code[id] = readCode(inputData, code);

			int monthWorkedHours = readMonthWorkedHours(inputData);

			char shiftWork = readShiftWork(inputData);

			char category = readCategory(inputData);

			double hourValue = calculateHourValue(shiftWork, category);

			double basicSalary = calculateBasicSalary(monthWorkedHours, hourValue);

			double mealVoucher = calculateMealVoucher(basicSalary);

			System.out.println("\nCódigo do funcionário: " + code[id]);
			System.out.println("Número de horas trabalhadas: " + monthWorkedHours);
			System.out.println("Salário inicial: " + basicSalary);
			System.out.println("Auxilio alimentação: " + mealVoucher);
			System.out.println("Salário final: " + (basicSalary + mealVoucher));
			System.out.println();
		}

	}

	private static double calculateBasicSalary(int monthWorkedHours, double hourValue) {
		return hourValue * monthWorkedHours;
	}

	private static int readMonthWorkedHours(Scanner inputData) {
		System.out.print("Quantidade de horas trabalhadas no mês: ");
		int monthWorkedHours = inputData.nextInt();
		return monthWorkedHours;
	}

	private static int readCode(Scanner inputData, int[] codes) {
		int newCode;

		do {
			System.out.print("Insira o código do funcionário: ");
			newCode = inputData.nextInt();
		} while (codeExists(codes, newCode));

		return newCode;

	}

	private static boolean codeExists(int[] codes, int newCode) {
		boolean find = false;

		for (int code : codes) {
			if (code == newCode) {
				find = true;
				break;
			}
		}

		return find;
	}

	private static double calculateMealVoucher(double basicSalary) {
		double mealVoucher;

		if (basicSalary <= 300.00) {
			mealVoucher = basicSalary * 0.2;
		} else if (basicSalary > 300.00 && basicSalary <= 600.00) {
			mealVoucher = basicSalary * 0.15;
		} else {
			mealVoucher = basicSalary * 0.05;
		}
		return mealVoucher;
	}

	private static double calculateHourValue(char shiftWork, char category) {
		double hourValue;

		if (category == 'G') {
			if (shiftWork == 'N') {
				hourValue = basicSalary * 0.18;
			} else {
				hourValue = basicSalary * 0.15;
			}
		} else if (shiftWork == 'N') {
			hourValue = basicSalary * 0.13;
		} else {
			hourValue = basicSalary * 0.10;
		}

		return hourValue;
	}

	private static char readCategory(Scanner inputData) {
		char category = 'X';

		System.out.print("Categoria [O,G]: ");

		while (category != 'G' && category != 'O') {

			category = inputData.next().charAt(0);

			if (category != 'G' && category != 'O') {
				System.out.print("Categoria inválida, insira O ou G: ");
			}
		}

		return category;
	}

	private static char readShiftWork(Scanner inputData) {

		char shiftWork = 'X';

		System.out.print("Turno [M,V,N]: ");

		while (shiftWork != 'M' && shiftWork != 'V' && shiftWork != 'N') {

			shiftWork = inputData.next().charAt(0);

			if (shiftWork != 'M' && shiftWork != 'V' && shiftWork != 'N') {
				System.out.print("Turno inválido, insira M, V ou N: ");
			}
		}

		return shiftWork;
	}
}
