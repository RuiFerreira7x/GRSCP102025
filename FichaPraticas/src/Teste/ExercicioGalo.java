package Teste;

import java.util.Scanner;

import static Teste.Funções_Galo.*;


public class ExercicioGalo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int opcao = 1;
        boolean login = true;

        String[][] matriz = new String[3][3];

        do {

            int jogador = 1;
            int vencedor = 0;
            int contador = 1;
            matriz = preencher_Matriz(matriz);


            switch (opcao) {

                case 1:

                    imprimir_o_Tabuleiro(matriz);

                    do {

                        if (jogador == 1) {

                            jogador01_joga(matriz);
                            imprimir_o_Tabuleiro(matriz);
                            jogador++;
                            contador++;

                        } else if (jogador == 2) {

                            jogador02_joga(matriz);
                            imprimir_o_Tabuleiro(matriz);
                            jogador--;
                            contador++;

                        }

                        if (vencedor1(matriz)) {

                            vencedor = 1;
                            System.out.println("-----------------");
                            System.out.println("Jogador 1 ganhou!");
                        }

                        if (vencedor2(matriz)) {

                            vencedor = 2;
                            System.out.println("-----------------");
                            System.out.println("Jogador 2 ganhou!");
                        }

                    } while (contador < 10 && vencedor < 1);

                    if (!vencedor1(matriz) && !vencedor2(matriz)) {

                        System.out.println("-----------------");
                        System.out.println("O Jogo Ficou Empate!");
                    }




                    break;

                case 9:

                    login = false;
                    break;

                default:
                    System.out.println("-----------------");
                    System.out.println("Escolha 1 ou 2!");

                    break;
            }

            if (!login) break;
            System.out.println("-----------------");
            System.out.println("Deseja jogar outra vez? ");
            System.out.println("1. Jogar novamente");
            System.out.println("2. Sair");
            System.out.println("-----------------");
            opcao = input.nextInt();

        } while (login);
    }
}