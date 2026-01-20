package FichaPratica01.FichaPratica05;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Leitura
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Impressão
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println();
        }
    }
}
