package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número inteiro: ");
        int vezes = input.nextInt();
        input.nextLine();

        System.out.print("Introduza a mensagem: ");
        String mensagem = input.nextLine();

        int i = 0;
        while (i < vezes) {
            System.out.println(mensagem);


        }
    }
}