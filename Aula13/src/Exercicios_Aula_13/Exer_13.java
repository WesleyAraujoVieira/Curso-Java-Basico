/*
 Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
  
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
package Exercicios_Aula_13;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas hoas trabalhadas no mês? ");
        double horasMes = scan.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double descInss = (salarioBruto * 8) / 100;
        double descSindicato = (salarioBruto * 5) / 100;
        double descIr = (salarioBruto * 11) / 100;
        double totalDescontos = descInss + descSindicato + descIr;
        double salarioLiq = salarioBruto - totalDescontos;

        System.out.println("O seu salário bruto é R$: " + salarioBruto);
        System.out.println("Foi pago ao INSS o valor de R$: " + (salarioBruto * 8) / 100);
        System.out.println("Foi pago ao sindicato o valor de R$: " + (salarioBruto * 5) / 100);
        System.out.println("Foi pago de Imoposto de renda o valor de R$: " + descIr);
        System.out.println("O total de descontos é: " + totalDescontos);
        System.out.println("O seu salário líquido é de R$: " + salarioLiq);
    }
}
