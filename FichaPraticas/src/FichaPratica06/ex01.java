package FichaPratica06;

import java.util.Scanner;

public class ex01 {

    public static void ValorinteiroPositivo ( int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("*");

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduza um numero: ");
            num= input.nextInt();

        } while (num <= 0);
        System.out.println();
        ValorinteiroPositivo(num);

    }
}
