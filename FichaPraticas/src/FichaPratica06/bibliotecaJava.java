package FichaPratica01.FichaPratica06;

public class bibliotecaJava {

    /**
     * Fatorial para um numero
     * @param num numero a ser calculado
     * @return fotorial do numero
     */
    public static int fatorial(int num) {

        int resultado = num;
        int decremento = num - 1;

        while (decremento > 0) {
            resultado *= decremento--;
        }
        return resultado;

    }
}
