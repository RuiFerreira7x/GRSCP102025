package FichaPratica01.FichaPratica04;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {
            System.out.println("\n\n******** MENU ********");
            System.out.println("1. CRIAR TAREFA");
            System.out.println("2. ATUALIZAR TAREFA");
            System.out.println("3. ELIMINAR TAREFA");
            System.out.println("4. LISTAR TAREFAS");
            System.out.println("0. SAIR");

            System.out.print("Opção: ");
            opcao= input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n**** CRIAR TAREFA ****");
                    break;

                case 2:
                    System.out.println("\n**** ATUALIZAR TAREFA ****");
                    break;

                case 3:
                    System.out.println("\n**** ELIMINAR TAREFA ****");
                    break;

                case 4:
                    System.out.println("\n**** LISTAR TAREFAS ****");
                    break;

                case 0:
                    System.out.println("\nObrigado e até à próxima!");
                    break;

                default:
                    System.out.println("\nOpção inválida!!!");
                    break;
            }

        } while (opcao != 0);

    }
}
