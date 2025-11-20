package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite um número maior que 2: ");
        num= input.nextInt();

        int i = 2;

        while (i <= num) {
            System.out.print(i + " ");
            i += 2;
        }

    }
}