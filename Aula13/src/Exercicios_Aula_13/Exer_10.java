/*
Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit. (°F = °C × 1, 8 + 32)
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius: ");
        double grausc = scan.nextDouble();

        double f = (grausc * 1.8) + 32;

        System.out.println("A temperatura informada em graus Celsius equivale a " + f + " Farenheit.");
    }
}
