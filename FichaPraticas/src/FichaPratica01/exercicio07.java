package FichaPratica01.FichaPratica01;

import java.util.Scanner;

public class exercicio07 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variaveis valor1 e valor2 e valor3
        double valor1, valor2, valor3, total;


        System.out.println("insira preco ");
        valor1 = input.nextDouble();
        System.out.println("insira outro valor ");
        valor2 = input.nextDouble();
        System.out.println("insira terceiro valor");
        valor3 = input.nextDouble();

        //total %10
        total = valor1 + valor2 + valor3;
        double desconto = total * 0.10;

        double valorFinal = total - desconto;

        System.out.printf("Valor a pagar com 10%% de desconto: %.2f euros%n", valorFinal);

    }
}

