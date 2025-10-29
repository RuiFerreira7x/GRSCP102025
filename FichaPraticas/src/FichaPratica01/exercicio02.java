package FichaPratica01;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //declara variaveis
        int numero1, numero2, soma, subtracao, multiplicacao, divisao;
                //ler o numero
        System.out.print("insira um numero: ");
        numero1 = input.nextInt();
        System.out.print("insirir outro numero: ");
        numero2 = input.nextInt();

        soma=numero1+numero2;
        subtracao=numero1-numero2 ;
        multiplicacao=numero1*numero2;
        divisao=numero1/numero2;
        System.out.println("soma " +soma );
        System.out.println("subtração " +subtracao);
        System.out.println("multiplicação " +multiplicacao);
        System.out.println("divisão " +divisao);

    }
}
