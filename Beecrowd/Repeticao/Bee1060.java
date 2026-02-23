import java.util.Scanner;

public class Bee1060 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x;
        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            x = teclado.nextDouble();
            if (x >= 0) {
                positivos ++;
            }
        }

        System.out.println(positivos + " valores positivos");



        teclado.close();
    }
}
