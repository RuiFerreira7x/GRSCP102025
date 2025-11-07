package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario1, salario2, imposto;

        System.out.println(" Insira o salario 1: ");
        salario1 = input.nextInt();

        System.out.println(" Insira o salario 2: ");
        salario2 = input.nextInt();

        if (salario1 >= 15000) {

            imposto = (int) (salario1 * 0.20);

            System.out.println("Salário até 15.000€ inclusive taxa de 20%: " +imposto);
        }else {
            imposto = (int) (salario2 * 0.30);

            System.out.println("Salário superior a 15.000€ taxa de 30%: " +imposto);
        }
    }
}
