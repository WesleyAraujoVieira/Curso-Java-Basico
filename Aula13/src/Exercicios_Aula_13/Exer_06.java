/*
 Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor para o raio do círculo: ");
        double raio = scan.nextDouble();

        //double area = 3.14 * (raio * raio);
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é de: " + area);

    }
}
