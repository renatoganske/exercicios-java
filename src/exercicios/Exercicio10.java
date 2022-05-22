package exercicios;

import java.util.Scanner;

//Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio.
//A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens:
//ACESSO PERMITIDO caso a senha seja v�lida e  ACESSO NEGADO caso a senha seja inv�lida.
public class Exercicio10 {

	public static void main(String[] args) {

		String savedPassword = "1234";
		String password;

		Scanner inputData = new Scanner(System.in);

		System.out.println("Digite a senha de acesso: ");
		password = inputData.next();

		if (password.equals(savedPassword)) {
			System.out.println("ACESSO PERMITIDO.");
		} else {
			System.out.println("ACESSO NEGADO.");
		}

		inputData.close();
	}

}
