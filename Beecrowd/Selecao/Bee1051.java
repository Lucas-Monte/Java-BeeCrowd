import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1051 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double renda, imposto;

        renda = teclado.nextDouble();

        if(renda > 0.00 && renda <= 2000.00) {
            imposto = 0;
        } else if(renda > 2000.00 && renda <= 3000.00) {
            imposto = (renda - 2000)*(8.00/100);
        } else if(renda > 3000.00 && renda <= 4500.00) {
            imposto = 1000.00*(8.00/100) + ((renda - 3000)*(18.00/100));
        } else {
            imposto = (1000.00*(8.00/100)) + 1500.00*(18.00/100) + ((renda-4500)*(28.00/100));
        }

        if(imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }

        teclado.close();
    }
}