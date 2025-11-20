package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int contador;

        System.out.print("Introduza um número: ");
        num = input.nextInt();


        contador = num - 5;
        while (contador < num) {
            System.out.print(contador + " ");
            contador++;
        }

        // Imprime os 5 seguintes
        contador = num + 1;
        while (contador <= num + 5) {
            System.out.print(contador + " ");
            contador++;
        }
    }
}
