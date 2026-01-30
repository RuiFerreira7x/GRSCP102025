package FichaPratica01.FichaPratica06;

import java.util.Scanner;

import static FichaPratica01.FichaPratica06.bibliotecaJava.fatorial;

public class DemonstracaoJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroUser;

        System.out.print("Insira um número: ");
        numeroUser= input.nextInt();

        int fatorialCalculado = fatorial(numeroUser);

        System.out.println(fatorialCalculado);

        System.out.println(fatorial(10));

    }
}
