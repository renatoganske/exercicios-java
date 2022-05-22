package exercicios;

import java.util.Scanner;

/*
 * A StackX abriu uma linha de cr�dito para os alunos. O valor m�ximo da
 * presta��o n�o poder� ultrapassar 30% do sal�rio bruto. Fazer um programa que
 * permita entrar com o sal�rio bruto, o valor do empr�stimo e o n�mero de
 * parcelas e informar o valor da parcela e se o empr�stimo pode ou n�o ser
 * concedido. Caso o empr�stimo n�o possa ser concedido, informar ainda o valor
 * m�ximo da presta��o.
 * 
 * @author Ganske
 */

public class Exercicio25 {

	public static void main(String[] args) {

		String studentName;
		double salary, loan, installmentValue, installmentMax;
		int installments;

		Scanner inputData = new Scanner(System.in);

		System.out
				.println("Ol�! Bem vindo � StackX! Para iniciarmos a simula��o do financiamento, digite o seu nome: ");
		studentName = inputData.next();

		System.out.printf("Perfeito %s! Agora precisamos de mais algumas informa��es. Qual o seu sal�rio?",
				studentName);
		salary = inputData.nextDouble();

		System.out.println("Qual o valor do empr�stimo pretendido?");
		loan = inputData.nextDouble();

		System.out.println("Qual a quantidade de parcelas pretendidas?");
		installments = inputData.nextInt();

		System.out.println("Muito obrigado pelas informa��es! \n");

		installmentValue = loan / installments;
		installmentMax = salary * 0.3;

		if (installmentValue <= installmentMax) {
			System.out.printf("Parab�ns %s! Voc� est� apto a receber o empr�stimo, o qual consistir� em %d de R$%.2f.",
					studentName, installments, installmentValue);
		} else {
			System.out.println("Ol� " + studentName
					+ ". Infelizmente o valor pretendido faz com que cada parcela ultrapasse o valor de 30% do seu sal�rio, \n"
					+ "o que, deacordo com nossa pol�tica de empr�stimos, n�o � permitido. Para solucionar isso, tente um valor \n"
					+ "menor ou uma quantidade maior de parcelas.");
		}
		inputData.close();
	}

}
