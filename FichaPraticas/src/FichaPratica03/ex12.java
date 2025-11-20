package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int intervalo1 = 0; // [0,25]
        int intervalo2 = 0; // [26,50]
        int intervalo3 = 0; // [51,75]
        int intervalo4 = 0; // [76,100]

        System.out.print("Introduza um número (negativo para terminar): ");
        num = input.nextInt();

        while (num >= 0) {
            if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num >= 26 && num <= 50) {
                intervalo2++;
            } else if (num >= 51 && num <= 75) {
                intervalo3++;
            } else if (num >= 76 && num <= 100) {
                intervalo4++;
            }

            System.out.print("Introduza um número inteiro positivo (negativo para terminar): ");
            num = input.nextInt();
        }


            System.out.println("Resultados:");
            System.out.println("[0,25]: " + intervalo1 + " número(s)");
            System.out.println("[26,50]: " + intervalo2 + " número(s)");
            System.out.println("[51,75]: " + intervalo3 + " número(s)");
            System.out.println("[76,100]: " + intervalo4 + " número(s)");


        }
    }
