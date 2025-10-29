package FichaPratica01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

    //import do scanner - fazemos sempre que queremos ler dados do utilizador
        Scanner input = new Scanner(System .in);

        //declar as variaveis
        int numero1, numero2, soma;

        //ler numero 1
        System.out.print("Insira um número: ");
        numero1 = input.nextInt();

        //ler numero 2
        System.out.print("Insira outro número: ");
                numero2 = input.nextInt();
        soma=numero1+numero2;
                System.out.print(numero1+numero2 +"soma");




    }

}
