package exercicios;

import java.util.Scanner;

/*
 * A StackX abriu uma linha de crédito para os alunos. O valor máximo da
 * prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa que
 * permita entrar com o salário bruto, o valor do empréstimo e o número de
 * parcelas e informar o valor da parcela e se o empréstimo pode ou não ser
 * concedido. Caso o empréstimo não possa ser concedido, informar ainda o valor
 * máximo da prestação.
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
				.println("Olá! Bem vindo à StackX! Para iniciarmos a simulação do financiamento, digite o seu nome: ");
		studentName = inputData.next();

		System.out.printf("Perfeito %s! Agora precisamos de mais algumas informações. Qual o seu salário?",
				studentName);
		salary = inputData.nextDouble();

		System.out.println("Qual o valor do empréstimo pretendido?");
		loan = inputData.nextDouble();

		System.out.println("Qual a quantidade de parcelas pretendidas?");
		installments = inputData.nextInt();

		System.out.println("Muito obrigado pelas informações! \n");

		installmentValue = loan / installments;
		installmentMax = salary * 0.3;

		if (installmentValue <= installmentMax) {
			System.out.printf("Parabéns %s! Você está apto a receber o empréstimo, o qual consistirá em %d de R$%.2f.",
					studentName, installments, installmentValue);
		} else {
			System.out.println("Olá " + studentName
					+ ". Infelizmente o valor pretendido faz com que cada parcela ultrapasse o valor de 30% do seu salário, \n"
					+ "o que, deacordo com nossa política de empréstimos, não é permitido. Para solucionar isso, tente um valor \n"
					+ "menor ou uma quantidade maior de parcelas.");
		}
		inputData.close();
	}

}
