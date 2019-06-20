/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número do tipo inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Informe um número do tipo inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Informe um número do tipo real: ");
        double num3 = scan.nextDouble();

        double calcA = (num1 * 2) * (num2 / 2);
        double calcB = (num1 * 3) + num3;
        //double calcC = num3 * num3 * num3;
        double calcC = Math.pow(num3, 3);

        System.out.println("Questão A: " + calcA);
        System.out.println("Questão A: " + calcB);
        System.out.println("Questão A: " + calcC);
    }
}
