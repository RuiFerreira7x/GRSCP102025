package PCE_ruiFerreira;

import java.util.Scanner;

public class PCE_ruiFerreira {

    /**
     * Função para verificar se há vencedor
     * @param num verficar o jogador1 ou jogador2
     * @return true há vencedor false  continua o jogo
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] galo = new int[3][3];
        String jogador1="X";
        String jogador2="O";


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
            System.out.println();
        }
    }
}

