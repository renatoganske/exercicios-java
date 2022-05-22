package exercicios;

import java.util.Scanner;

//Fa�a um programa que receba o sal�rio de um funcion�rio chamado Carlos.
//Sabe-se que outro funcion�rio,Jo�o,tem sal�rio equivalente a um ter�o do sal�rio de Carlos.
//Carlos aplicar� seu sal�rio integralmente na caderneta de poupan�a,que rende 2%ao m�s
//e Jo�o aplicar� seu sal�rio integralmente no fundo de renda fixa,que rende 5%ao m�s.
//O programa dever� calcular e mostrar a quantidade de meses necess�rios para que o 
//valor pertencente a Jo�o iguale ou ultrapasse o valor pertencente a Carlos.

public class Exercicio6 {

	public static void main(String[] args) {

		double salaryCarlos;
		double salaryJoao;
		int month = 1;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Ol�! Digite o sal�rio do Carlos: ");

		salaryCarlos = inputData.nextDouble();
		salaryJoao = salaryCarlos / 3;

		while (salaryJoao < salaryCarlos) {
			salaryCarlos = salaryCarlos * 1.02;
			salaryJoao = salaryJoao * 1.05;
			month++;

		}

		System.out.println("A quantidade de meses at� que o valor de Jo�o ultrapasse o de Carlos � de: " + month + ".");
		inputData.close();
	}
}
