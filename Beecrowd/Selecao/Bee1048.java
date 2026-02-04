import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1048 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double salario, aumento, percentual;

        salario = teclado.nextDouble();
        aumento = 0.00;
        percentual = 0.00;

        if(salario > 0 && salario <= 400.00){
            percentual = 15.00;
            aumento = salario*(percentual/100);
            salario += aumento;
        }
        else if(salario > 400.00 && salario <= 800.00){

            percentual = 12.00;
            aumento = salario*(percentual/100);
            salario += aumento;
        }
        else if(salario > 800.00 && salario <= 1200.00) {
            percentual = 10.00;
            aumento = salario*(percentual/100);
            salario += aumento;
        }
        else if(salario > 1200.00 && salario <= 2000.00) {
            percentual = 7.00;
            aumento = salario*(percentual/100);
            salario += aumento;
        }
        else if(salario > 2000.00) {
            percentual = 4.00;
            aumento = salario*(percentual/100);
            salario += aumento;
        }

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", aumento);
        System.out.printf("Em percentual: %.0f %%\n", percentual);

        teclado.close();
    }
}