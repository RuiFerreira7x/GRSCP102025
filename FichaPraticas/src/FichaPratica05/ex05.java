package FichaPratica01.FichaPratica05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] vetor = new double[10];

        // Leitura das comissões
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Comissões do mês " + i + ": ");
            vetor[i] = input.nextDouble();
        }

        // Calcular o total
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        double media = soma / vetor.length;

        System.out.println("Média: " + media);


    }
}
