package FichaPratica01;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //as variaveis
        double nota1, nota2, nota3,  mediaaritmetica, mediaponderada;

        //ler numero
        System.out.println("insira valor da Nota1: ");
        nota1 = input.nextDouble();
        System.out.println("insira valor da Nota2: ");
        nota2 = input.nextDouble();
        System.out.println("insira valor da Nota3: ");
        nota3 = input.nextDouble();

        mediaaritmetica=(nota1+nota2+nota3)/3;
        System.out.println("media " +mediaaritmetica);

        mediaponderada= (nota1*0.20)+(nota2*0.30)+(nota3*0.50);
        System.out.println("media ponderada " + mediaponderada);



    }
}
