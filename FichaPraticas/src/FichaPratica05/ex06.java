package FichaPratica01.FichaPratica05;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Leitura do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("______________________________");

        boolean crescente = true;

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                crescente = false;
                break;
            }

        }

        if (crescente) { // crescente == true
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }

    }
}
