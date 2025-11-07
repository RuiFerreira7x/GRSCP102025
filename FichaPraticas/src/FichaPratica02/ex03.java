package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;
        double imposto;

        System.out.println("Introduza o salário");
        salario = input.nextInt();

        if (salario <= 15000) {
            imposto = salario * 0.20;
        } else if (salario <= 20000) {
            imposto = salario * 0.30;
        } else if (salario <= 25000) {
            imposto = salario * 0.35;
        } else {
            imposto = salario * 0.40;
        }

        System.out.println("Impostos a pagar: ");

    }
}

