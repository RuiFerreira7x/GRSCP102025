package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        int Horas, Minutos;

        System.out.println("Introduza as horas: ");
        Horas = input.nextInt();

        System.out.println("Introduza os minutos: ");
        Minutos = input.nextInt();

        if (Horas >= 12) {
            System.out.println("Am");
         } else {
            Horas =Horas - 12;
        System.out.println("PM");

        }
    }
}
