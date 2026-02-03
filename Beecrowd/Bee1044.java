import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bee1044 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        a = teclado.nextInt();
        b = teclado.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }


       
        teclado.close();
    }
}