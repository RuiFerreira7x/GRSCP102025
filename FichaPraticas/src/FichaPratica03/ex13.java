package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorincial,valorfinal;

        System.out.print("Introduza o valor do início: ");
        valorincial = input.nextInt();

        System.out.print("Introduza o valor final: ");
        valorfinal = input.nextInt();

        while (valorincial <= valorfinal) {
            if (valorincial % 5 == 0) {
                System.out.println(valorincial);
            }
            valorincial++;
        }

    }
}
