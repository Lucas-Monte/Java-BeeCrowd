import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bee1042 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        List<Integer> lista = new ArrayList<>();

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        lista.sort(null);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\n" + n1);
        System.out.println(n2);
        System.out.println(n3);



       
        teclado.close();
    }
}