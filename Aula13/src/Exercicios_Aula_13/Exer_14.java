/*
Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo para download? ");
        double arquivo = scan.nextDouble();

        System.out.println("Qual a velocidade do link? ");
        double velocidadeLink = scan.nextDouble();

        double tempoAproximado = arquivo / velocidadeLink;

        System.out.println("O tempo estimado para o download é de: " + tempoAproximado);
    }
}
