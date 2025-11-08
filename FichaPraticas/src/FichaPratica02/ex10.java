package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        int num1,num2;
        String operacao;

        System.out.print("Introduza o primeiro número : ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo número : ");
        num2 = input.nextInt();

        System.out.print("Qual operação deseja realizar? (+ - * /): ");
        operacao = String.valueOf(input.nextInt());

        double resultado;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

        }

    }
}