/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota 1: ");
        int nota1 = scan.nextInt();

        System.out.println("Informe a nota 2: ");
        int nota2 = scan.nextInt();

        System.out.println("Informe a nota 3: ");
        int nota3 = scan.nextInt();

        System.out.println("Informe a nota 4: ");
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas informadas é: " + media);
    }
}
