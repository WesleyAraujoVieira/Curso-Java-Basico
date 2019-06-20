/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês? ");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O seu salário neste mês é de: " + "R$ " + salario);
    }
}
