package exercicios;

import java.util.Scanner;

//Faça um programa que receba o salário de um funcionário chamado Carlos.
//Sabe-se que outro funcionário,João,tem salário equivalente a um terço do salário de Carlos.
//Carlos aplicará seu salário integralmente na caderneta de poupança,que rende 2%ao mês
//e João aplicará seu salário integralmente no fundo de renda fixa,que rende 5%ao mês.
//O programa deverá calcular e mostrar a quantidade de meses necessários para que o 
//valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.

public class Exercicio6 {

	public static void main(String[] args) {

		double salaryCarlos;
		double salaryJoao;
		int month = 1;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Olá! Digite o salário do Carlos: ");

		salaryCarlos = inputData.nextDouble();
		salaryJoao = salaryCarlos / 3;

		while (salaryJoao < salaryCarlos) {
			salaryCarlos = salaryCarlos * 1.02;
			salaryJoao = salaryJoao * 1.05;
			month++;

		}

		System.out.println("A quantidade de meses até que o valor de João ultrapasse o de Carlos é de: " + month + ".");
		inputData.close();
	}
}
