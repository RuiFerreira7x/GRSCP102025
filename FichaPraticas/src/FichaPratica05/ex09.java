package FichaPratica01.FichaPratica05;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            int soma = 0;
            for(int i = 0; i < matriz.length; i++) {
                soma += matriz[i][i];
            }
            System.out.println("resultado: " + soma);
        }

    }
}
