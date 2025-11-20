package FichaPratica01.FichaPratica03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, salto;

        System.out.println("Insira um numero limite: ");
        limite= input.nextInt();

        System.out.println("Insira um salto: ");
        salto= input.nextInt();

        int i = 0;
        while (i <= limite) {
            System.out.println(i);
            i += salto;
        }
    }
}
