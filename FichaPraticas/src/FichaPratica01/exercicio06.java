package FichaPratica01;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        //variaveis valor1 e valor2
        int valor1, valor2;


        System.out.println("insira um valor " );
        valor1=input.nextInt();
        System.out.println("insira outro valor " );
        valor2=input.nextInt();

        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        System.out.println("valor1 "+ valor1);
        System.out.println("valor2 "+ valor2 );

    }



}
