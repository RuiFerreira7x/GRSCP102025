package FichaPratica01.FichaPratica02;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        int numero1 = 0,numero2 = 0,numero3 = 0;


        if (numero1 > numero2 && numero1 > numero3) {
         if (numero2 >numero3) {
            System.out.println(numero1 +""+numero2 +""+numero3+"" );
                }else {
            System.out.println(numero1 +""+numero2 +""+numero3+"" );
        }

            if (numero2 > numero3 && numero2 > numero1) {
            } if (numero3 >numero1){
            System.out.println(numero2 +""+numero3 +"" +numero1+"" );
                }else {
            System.out.println(numero2+"" +numero3+""+numero1+"" );
        }

                if (numero3 > numero1 && numero3 > numero2) {
                } if (numero1 >numero2){
            System.out.println(numero3 +""+numero1+""+numero2+"" );
                    }else {
            System.out.println(numero3+""+numero1+""+numero2+"" );
        }

}
}
