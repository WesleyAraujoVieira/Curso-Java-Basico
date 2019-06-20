/*
 Faça um Programa que calcule a área de um quadrado, em seguida, 
 mostre o dobro desta área para o usuário.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida do lado do quadrado: ");
        double lado = scan.nextDouble();

        //double area =  (lado * lado) * 2;
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é de: " + area);
        System.out.println("A área (em dobro) do quadrado é de: " + area * 2);
    }
}
