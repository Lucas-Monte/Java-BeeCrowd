import java.util.Scanner;

public class Bee1065 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares ++;
            }
        }

        System.out.println(pares + " valores pares");

        teclado.close();
    }
}
