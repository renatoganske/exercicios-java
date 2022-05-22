package exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Desenvolva um programa que dada a data de nascimento de uma pessoa e a data
 * atual, informe a idade dessa pessoa em anos completos.
 * 
 * @author Ganske
 *
 */
public class Exercicio28 {

    public static void main(String[] args) {
    	

        int day, month, year;
    	
        Scanner inputData = new Scanner(System.in);


        System.out.print("Digite o dia de nascimento: ");
        day = inputData.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        month = inputData.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        year = inputData.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDate, today);

        System.out.printf("Você tem %d anos de idade!", age);
        inputData.close();
    }

}
