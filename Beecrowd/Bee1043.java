import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bee1043 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, area, perimetro, maior, menor1, menor2;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        maior = a;
        menor1 = b;
        menor2 = c;

        if (b > maior && b > c) {
            maior = b;
            menor1 = a;
        }
        else if (c > maior && b < c) {
            maior = c;
            menor2 = a;
        }


        if ((menor1 + menor2) > maior) {
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            area = ((a + b) * c) / 2.0;
            System.out.printf("Area = %.1f\n", area);
        }


       
        teclado.close();
    }
}