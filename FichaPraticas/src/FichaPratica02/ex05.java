package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler números
        System.out.print("Insira o 1º número: ");
        num1 = input.nextInt();

        System.out.print("Insira o 2º número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num1 + " " + num2);
        }

    }
}
