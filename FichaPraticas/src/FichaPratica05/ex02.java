package FichaPratica01.FichaPratica05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];

        // Leitura das comissões
        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Comissões do mês " + i + ": ");
            comissoes[i] = input.nextDouble();
        }

        // Calcular o total anual (somar todos os meses)
        double total = 0;

        for (int i = 0; i < comissoes.length; i++) {
            total = total + comissoes[i];
        }

        System.out.println("Total Anual: " + total);


    }
}
