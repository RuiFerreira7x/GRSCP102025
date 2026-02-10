package Teste;


import java.util.Scanner;

public class Funções_Galo {


        /**
         * Verifica se a posição ja foi ocupada
         * @param matriz
         * @param posicao
         * @return se a jogada é válida
         */
        public static boolean Ocupada(String[][] matriz, int posicao) {


            switch (posicao) {

                case 1:
                    if (!matriz[0][0].equals("1")) {
                        return true;
                    }
                    break;

                case 2:
                    if (!matriz[0][1].equals("2")) {
                        return true;
                    }
                    break;

                case 3:
                    if (!matriz[0][2].equals("3")) {
                        return true;
                    }
                    break;

                case 4:
                    if (!matriz[1][0].equals("4")) {
                        return true;
                    }
                    break;

                case 5:
                    if (!matriz[1][1].equals("5")) {
                        return true;
                    }
                    break;

                case 6:
                    if (!matriz[1][2].equals("6")) {
                        return true;
                    }
                    break;

                case 7:
                    if (!matriz[2][0].equals("7")) {
                        return true;
                    }
                    break;

                case 8:
                    if (!matriz[2][1].equals("8")) {
                        return true;
                    }
                    break;

                case 9:
                    if (!matriz[2][2].equals("9")) {
                        return true;
                    }
                    break;


            }

            return false;
        }

        /**
         * Imprime o tabuleiro do jogo
         * @param matriz
         *@return o tabuleiro prenchido
         */
        public static void imprimir_o_Tabuleiro(String[][] matriz) {

            System.out.println("-----------------");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print("|" + matriz[i][j]);
                }
                System.out.print("|");
                System.out.println("\n-----------------");

            }

        }

        /**
         * O Jogador 1 joga onde quer
         * @param matriz
         * @return jogada do jogador 1
         */
        public static String[][] jogador01_joga(String[][] matriz) {

            Scanner input = new Scanner(System.in);
            int posicao = 0;
            boolean jogadaValida = false;

            while (!jogadaValida) {
                jogadaValida = true;

                System.out.println("-----------------");
                System.out.print("Introduza a posição onde quer jogar (Jogador 1 [X]):  ");
                posicao = input.nextInt();
                if (posicao < 1 || posicao > 9) {
                    System.out.println("-----------------");
                    System.out.println("Escolha uma posição válida! ( 1 - 9 )");
                    jogadaValida = false;
                } else if (Ocupada(matriz, posicao)) {
                    jogadaValida = false;
                    System.out.println("-----------------");
                    System.out.println("Posição já esta ocupada!");
                }
            }

            switch (posicao) {

                case 1:
                    matriz[0][0] = "X";
                    break;

                case 2:
                    matriz[0][1] = "X";
                    break;

                case 3:
                    matriz[0][2] = "X";
                    break;

                case 4:
                    matriz[1][0] = "X";
                    break;

                case 5:
                    matriz[1][1] = "X";
                    break;

                case 6:
                    matriz[1][2] = "X";
                    break;

                case 7:
                    matriz[2][0] = "X";
                    break;

                case 8:
                    matriz[2][1] = "X";
                    break;

                case 9:
                    matriz[2][2] = "X";
                    break;

                default:
                    System.out.println("-----------------");
                    System.out.println(" Introduza uma posição válida! ( 1 - 9 )");
                    break;

            }

            return matriz;
        }

        /**
         * O Jogador 2 joga onde quer
         * @param matriz
         * @return jogada do jogador 2
         */
        public static String[][] jogador02_joga(String[][] matriz) {

            Scanner input = new Scanner(System.in);
            int num, posicao = 0;
            boolean jogadaValida = false;

            while (!jogadaValida) {
                jogadaValida = true;

                System.out.println("-----------------");
                System.out.print("Introduza a posição onde quer jogar (Jogador 2 [O]):  ");
                posicao = input.nextInt();
                if (posicao < 1 || posicao > 9) {
                    System.out.println("-----------------");
                    System.out.println("Escolha uma posição válida! ( 1 - 9 )");
                    jogadaValida = false;
                } else if (Ocupada(matriz, posicao)) {
                    jogadaValida = false;
                    System.out.println("-----------------");
                    System.out.println("Posição já esta ocupada!");
                }
            }

            switch (posicao) {

                case 1:
                    matriz[0][0] = "O";
                    break;

                case 2:
                    matriz[0][1] = "O";
                    break;

                case 3:
                    matriz[0][2] = "O";
                    break;

                case 4:
                    matriz[1][0] = "O";
                    break;

                case 5:
                    matriz[1][1] = "O";
                    break;

                case 6:
                    matriz[1][2] = "O";
                    break;

                case 7:
                    matriz[2][0] = "O";
                    break;

                case 8:
                    matriz[2][1] = "O";
                    break;

                case 9:
                    matriz[2][2] = "O";
                    break;

                default:
                    System.out.println("-----------------");
                    System.out.println(" Introduza uma posição válida! ( 1 - 9 )");
                    break;

            }

            return matriz;
        }

        /**
         * Preenche o tabuleiro de jogo
         * @param matriz
         * @return tabuleiro preenchido
         */
        public static String[][] preencher_Matriz(String[][] matriz) {

            Integer contador = 1;

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[0].length; j++) {

                    matriz[i][j] = contador.toString();
                    contador++;
                }
            }
            return matriz;

        }

        /**
         * Testa se o jogador 1 ja tem vitória
         * @param matriz
         * @return jogador 1 é o vencedor
         */
        public static boolean vencedor1(String[][] matriz) {

            boolean vencedor = false;

            if (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) {

                vencedor = true;

            }

            if (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) {

                vencedor = true;

            }

            if (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) {

                vencedor = true;

            }

            if (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) {

                vencedor = true;

            }

            if (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) {

                vencedor = true;

            }

            if (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")) {

                vencedor = true;

            }

            if (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) {

                vencedor = true;

            }

            if (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {

                vencedor = true;

            }

            return vencedor;
        }

        /**
         Testa se o jogador 2 já tem vitória
         * @param matriz
         * @return jogador 2 é o vencedor
         */
        public static boolean vencedor2(String[][] matriz) {

            boolean vencedor = false;

            if (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O")) {

                vencedor = true;

            }

            if (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O")) {

                vencedor = true;

            }

            if (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) {

                vencedor = true;

            }

            if (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) {

                vencedor = true;

            }

            if (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O")) {

                vencedor = true;

            }

            if (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")) {

                vencedor = true;

            }

            if (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) {

                vencedor = true;

            }

            if (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {

                vencedor = true;

            }

            return vencedor;
        }


    }