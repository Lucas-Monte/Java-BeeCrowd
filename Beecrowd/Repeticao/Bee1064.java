import java.util.Scanner;
public class Bee1064{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        float valor, media, soma;
        soma = 0;
        int positivos = 0;

        for(int i = 1; i <= 6; i++) {
            valor = scanner.nextFloat();
            if (valor >= 0) {
                positivos ++;
                soma += valor;
            }
        }

        media = soma / positivos;

        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n", media);


        scanner.close();
    }
}