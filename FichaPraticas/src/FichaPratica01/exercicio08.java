package FichaPratica01.FichaPratica01;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int totalSegundos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduza os minutos da música " + i + ": ");
            int minutos = Scanner.nextInt();
            System.out.print("Introduza os segundos da música " + i + ": ");
            int segundos = Scanner.nextInt();
            totalSegundos += minutos * 60 + segundos;
        }

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("Total do Álbum: %dh %dm %ds%n", horas, minutos, segundos);
}
