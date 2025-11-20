package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1, limite;
        String mensagem;

        // Ler limite
        System.out.print("Quantas vezes queres a mensagem: ");
        limite = input.nextInt();

        System.out.print("Mensagem: ");
        input.nextLine(); // Limpeza de buffer
        mensagem = input.nextLine();

        while (num <= limite) {
            System.out.println(mensagem);
            num = num + 1;


        }
    }
}