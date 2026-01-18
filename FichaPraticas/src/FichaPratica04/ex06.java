package FichaPratica01.FichaPratica04;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int tentativa;
        int tentativas = 0;

        // Jogador 1 escolhe um número entre 0 e 100
        System.out.print("Jogador 1, insira um número entre 0 e 100: ");
        numero1 = input.nextInt();

        // "Limpar o ecrã"
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n --- Agora é a vez do Jogador 2! ---\n");

        // Jogador 2 tenta adivinhar
        do {
            System.out.print("Jogador 2, tenta adivinhar o número: ");
            tentativa = input.nextInt();
            tentativas++;

            if (tentativa < numero1) {
                System.out.println("O valor é MAIOR do que " + tentativa + ".\n");
            } else if (tentativa > numero1) {
                System.out.println("O valor é MENOR do que " + tentativa + ".\n");
            }

        } while (tentativa != numero1);

        System.out.println("Parabéns! Acertaste no número.");
        System.out.println("Número de tentativas: " + tentativas);

    }
}
