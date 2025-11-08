package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Introduza a 1-nota: ");
        nota1 = input.nextDouble();

        System.out.println("Introduza a 2-nota: ");
        nota2 = input.nextDouble();

        System.out.println("Introduza a 3-nota: ");
        nota3 = input.nextDouble();

        media = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.40);

        System.out.printf("Média final ponderada: ");

        if (media > 9.5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

    }

}
