package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o valor de início do intervalo: ");
        int inicio = input.nextInt();

        System.out.print("Introduza o valor de fim do intervalo: ");
        int fim = input.nextInt();

        int i = inicio;
        while (i <= fim) {
            System.out.println(i);

        }
    }
}