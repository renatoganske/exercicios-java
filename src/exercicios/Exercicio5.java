package exercicios;

import java.util.Scanner;

/**
 * Uma empresa possui dez funcion�rios com as seguintes caracter�sticas: c�digo,
 * n�mero de horas trabalhadas no m�s, turno de trabalho (M � matutino; V �
 * vespertino; N � noturno), categoria (O � oper�rio; ou G � gerente), valor da
 * hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de
 * pagamento, fa�a um programa que: a) Leia as informa��es dos funcion�rios,
 * exceto o valor da hora trabalhada, n�o permitindo que sejam informa��es dos
 * turnos e nem categorias inexistentes. Trabalhe sempre com a digita��o de
 * letras mai�sculas; b) Calcule o valor da hora trabalhada, conforme a tabela
 * 1. Adote o valor de R$450,00 para o sal�rio m�nimo; c) Calcule o sal�rio
 * inicial dos funcion�rios com base no valor da hora trabalhada e no n�mero de
 * horas trabalhadas; d) Calcule o valor do aux�lio alimenta��o recebido pelo
 * funcion�rio de acordo com seu sal�rio inicial, conforme a tabela 2; e) Mostre
 * o c�digo, n�mero de horas trabalhadas, valor da hora trabalhada, sal�rio
 * inicial, aux�lio alimenta��o e sal�rio final (sal�rio inicial + aux�lio
 * alimenta��o).
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

			System.out.println("\nC�digo do funcion�rio: " + code[id]);
			System.out.println("N�mero de horas trabalhadas: " + monthWorkedHours);
			System.out.println("Sal�rio inicial: " + basicSalary);
			System.out.println("Auxilio alimenta��o: " + mealVoucher);
			System.out.println("Sal�rio final: " + (basicSalary + mealVoucher));
			System.out.println();
		}

	}

	private static double calculateBasicSalary(int monthWorkedHours, double hourValue) {
		return hourValue * monthWorkedHours;
	}

	private static int readMonthWorkedHours(Scanner inputData) {
		System.out.print("Quantidade de horas trabalhadas no m�s: ");
		int monthWorkedHours = inputData.nextInt();
		return monthWorkedHours;
	}

	private static int readCode(Scanner inputData, int[] codes) {
		int newCode;

		do {
			System.out.print("Insira o c�digo do funcion�rio: ");
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
				System.out.print("Categoria inv�lida, insira O ou G: ");
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
				System.out.print("Turno inv�lido, insira M, V ou N: ");
			}
		}

		return shiftWork;
	}
}
