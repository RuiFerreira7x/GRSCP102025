package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num;

        // Ler números
        System.out.print("Insira o número: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }
}
