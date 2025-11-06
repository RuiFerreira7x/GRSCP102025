package FichaPratica01.FichaPratica01;

import java.util.Scanner;

public class exercicio07 {


    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

            //variaveis valor1 e valor2 e valor3
            int valor1, valor2, valor3;


            System.out.println("insira preco " );
            valor1=input.nextInt();
            System.out.println("insira outro valor " );
            valor2=input.nextInt();
            System.out.println("insira terceiro valor");
            valor3= input.nextInt();

            //total %10

            double desconto = Total * 0.10;

            double valorFinal = total - desconto;

            System.out.printf("Valor a pagar com 10%% de desconto: %.2f euros%n", valorFinal);


}
