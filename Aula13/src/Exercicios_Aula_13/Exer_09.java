/*
Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Farenheit: ");
        double grausf = scan.nextDouble();

        double c = (5 * (grausf - 32) / 9);

        System.out.println("A temperatura informada em graus Farenheit equivale a " + c + " Celsius.");
    }
}
