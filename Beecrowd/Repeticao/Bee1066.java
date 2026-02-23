import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Bee1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 5; i++) {
            numero = teclado.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos ++;
            }
            if (numero % 2 == 0) {
                pares ++;
            } else {
                impares ++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        teclado.close();
    }
}
