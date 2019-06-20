/*
 Faça um programa que converta metros para centímetros.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o total de metros: ");
        double metro = scan.nextDouble();

        double conversao = metro * 100;

        System.out.println("O valor " + metro + " em metros equivale a " + conversao + " centímetros.");

    }
}
