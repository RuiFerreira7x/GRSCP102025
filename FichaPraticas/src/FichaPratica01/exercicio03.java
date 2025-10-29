package FichaPratica01;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //declara variaveis
        double numero1, numero2, resultado;

        //ler o numero
        System.out.println("insira valor da area: ");
        numero1 = input.nextInt();
        System.out.print("insirir valor do perimetro: ");
        numero2 = input.nextInt();

        resultado=numero1*numero2;

        System.out.println("resultado " +resultado );


    }
}
