package FichaPratica01.FichaPratica04;

public class ex02 {
    public static void main(String[] args) {

        int soma = 0;

        System.out.println("Números ímpares entre 11 e 51:");

        for (int i = 11; i <= 51; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("Somatório: " + soma);
    }
}
