package FichaPratica01.FichaPratica04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = input.nextInt();

        System.out.println("Divisores de " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

    }
}
