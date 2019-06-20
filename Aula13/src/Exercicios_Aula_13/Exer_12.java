/*
Tendo como dados de entrada a altura de uma pessoa, construa
um algorítmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O seu peso ideal é: " + pesoIdeal);
    }
}
