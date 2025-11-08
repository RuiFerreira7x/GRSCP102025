package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salarioAnual, imposto;

        System.out.print("Insira o salário anual: ");
        salarioAnual = input.nextDouble();

        if (salarioAnual <= 15000) {
            imposto = salarioAnual * 0.2;
            System.out.println("Taxa de 20%: " + imposto + " €");
        } else if (salarioAnual <= 20000) {
            imposto = salarioAnual * 0.3;
            System.out.println("Taxa de 30%: " + imposto + " €");
        } else if (salarioAnual <= 25000) {
            imposto = salarioAnual * 0.35;
            System.out.println("Taxa de 35%: " + imposto + " €");
        } else {
            imposto = salarioAnual * 0.4;
            System.out.println("Taxa de 40%: " + imposto + " €");
        }

    }
}

