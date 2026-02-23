import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros;
        int x;
        int in = 0;
        int out = 0;


        numeros = teclado.nextInt();

        for (int i = 0; i < numeros; i++) {
            x = teclado.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        teclado.close();
    }
}
