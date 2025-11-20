package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int soma = 0;
        int quantidade = 0;

        System.out.print("Digite um número (-1 para terminar): ");
        numero = input.nextInt();

        while (numero != -1) {
            soma += numero;
            quantidade++;

            System.out.print("Digite um número (-1 para terminar): ");
            numero = input.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }

    }
}
