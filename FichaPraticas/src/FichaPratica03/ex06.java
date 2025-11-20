package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio,fim;

        System.out.print("Introduza o valor de início do intervalo: ");
        inicio = input.nextInt();

        System.out.print("Introduza o valor de fim do intervalo: ");
        fim = input.nextInt();


        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio + 1;

        }
    }
}