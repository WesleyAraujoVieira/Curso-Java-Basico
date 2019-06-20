/*
 Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número do tipo inteiro:");
        
        int numero = scan.nextInt();
        
        System.out.println("O número informado foi: " + numero);
    }
}
