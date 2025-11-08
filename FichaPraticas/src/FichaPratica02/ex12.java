package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        String opcao;
        String case1,case2,case3,case4;
        opcao = input.next();

                switch (opcao){
            case "1": System.out.println("Escolheu a opção  1. Criar");
                break;

            case "2": System.out.println("Escolheu a opção 2. Atualizar");
                break;

            case "3": System.out.println("Escolheu a opção 3. Elimina");
                break;

            default: System.out.println("Escolheu a opção 4. Sair");
                break;
        }
}
}
