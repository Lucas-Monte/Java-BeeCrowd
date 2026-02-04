import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1045 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        List<Double> lista = new ArrayList<>();
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.sort(null);
        Collections.reverse(lista);
   
        // for (int i = 0; i < lista.size(); i++) {
        //     System.out.println(lista.get(i));
        // }
        
        a = lista.get(0);
        b = lista.get(1);
        c = lista.get(2);

        if(a >= (b+c)) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }
        if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if(Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(a == b && b != c || a == c && b != c || b == c && a != c) {
            System.out.println("TRIANGULO ISOSCELES");
        }

       
        teclado.close();
    }
}