import java.util.Scanner;

public class Bee1071 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y, maior, menor;
        int soma = 0;

        x = teclado.nextInt();
        y = teclado.nextInt();

        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }


        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }


        System.out.println(soma);

        teclado.close();
    }
}
