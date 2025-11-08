package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        //variaves

        double saldo, movimento, saldoAposMovimento;

        System.out.print("Saldo: ");
        saldo = input.nextDouble();

        System.out.print("Valor a Depositar/Levatar: ");
        movimento = input.nextDouble();

        saldoAposMovimento = saldo+movimento;

        System.out.println("_____________________________________________");

        if (saldoAposMovimento >= 0) {
            // Movimento válido

            if (movimento > 0) {
                System.out.println("Operação realizada com sucesso: Depósito");
            } else {
                System.out.println("Operação realizada com sucesso: Levantamento");
            }

            saldo = saldoAposMovimento;
        } else {
            // Movimento inválido
            System.out.println("Operação inválida: Levantamento. Saldo insuficiente.");
        }

        System.out.println("Saldo Atual: " + saldo + " €");

    }
}
