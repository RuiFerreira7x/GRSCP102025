package FichaPratica01;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //ler variaveis
        double numero1, resultado;

        //ler o numero
        System.out.println("insira valor da area: ");
        numero1 = input.nextInt();
        System.out.println("o valor do PI: ");
        double numero2 = input.nextDouble();

        resultado=numero1*numero2;
        System.out.println("resultado " +resultado );





    }
}
