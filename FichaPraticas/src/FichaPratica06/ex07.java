package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.ex06.Ex06.*;

public class ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao, numero;

        System.out.print("Número a ser analisado: ");
        numero = input.nextInt();

        do {
            System.out.println("*-*-*-*-* Programa de Análise do Número: " + numero + " *-*-*-*-*");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo");
            System.out.println("4. Perfeito");
            System.out.println("5. Triangular");
            System.out.println("6. Trocar de Número: ");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:

                    if (numeroPar(numero)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Ímpar");
                    }

                    break;

                case 2:

                    if (numeroPositivo(numero)) {
                        System.out.println("Positivo");
                    } else {
                        System.out.println("Negativo");
                    }
                    break;

                case 3:

                    if (numeroPrimo(numero)) {
                        System.out.println("Primo");
                    } else {
                        System.out.println("Não primo");
                    }
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 0:
                    System.out.println("Obrigado e até à próxima!");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (opcao != 0);

    }
}
