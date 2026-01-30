package FichaPratica06;

public class ex06 {
    public class Ex06 {

        /**
         * Função para calcular se um número é par ou impar
         * @param num Número a ser analisado
         * @return true se par ou false se impar
         */
        public static boolean numeroPar(int num) {

            if (num % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

        /**
         * Função para calcular se positivo ou negativo
         * @param num Número a ser analisado
         * @return true se positivo (0 inclusive) ou false se negativo
         */
        public static boolean numeroPositivo(int num) {

            if (num >= 0) {
                return true;
            } else {
                return false;
            }
        }

        /**
         * Função para calcular se um número é primo ou não primo
         * @param num Número a ser analisado
         * @return <b>true se primo</b> ou <b>false se não primo</b>
         */
        public static boolean numeroPrimo(int num) {

            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    return false;
                }
            }

            return true;
        }


    }
}
