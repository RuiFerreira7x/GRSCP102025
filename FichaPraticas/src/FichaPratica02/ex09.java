package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        num3 = input.nextInt();

        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O menor número é: " + menor);

    }
}
