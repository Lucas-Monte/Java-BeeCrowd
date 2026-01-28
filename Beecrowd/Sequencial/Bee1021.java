import java.util.Scanner;
public class Bee1021{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       double total, resto;
       int n100, n50, n20, n10, n5, n2, m1, m05, m025, m010, m005, m001;
        total = scanner.nextDouble();
        // n100 = (int) total / 100;
        // resto = total % 100;
        // n50 = (int) resto / 50;
        // resto = resto % 50;
        // n20 = (int) resto / 20;
        // resto = resto % 20;
        // n10 = (int) resto / 10;
        // resto = resto % 10;
        // n5 = (int) resto / 5;
        // resto = resto % 5;
        // n2 = (int) resto / 2;
        // resto = resto % 2;
        // m1 = (int) resto / 1;
        // resto = resto % 1;
        // m05 = (int) (resto /  0.5) ;
        // resto = resto % 0.5;
        // m025 = (int) (resto / 0.25);
        // resto = resto % 0.25;
        // m010 = (int) Math.floor(resto / 0.10);
        // resto = resto % 0.10;
        // m005 = (int) (resto / 0.05);
        // resto = resto % 0.05;
        // m001 = (int) (resto / 0.01);
        int centavos = (int) Math.round(total * 100);
        n100 = centavos / 10000;
        centavos %= 10000;

        n50 = centavos / 5000;
        centavos %= 5000;

        n20 = centavos / 2000;
        centavos %= 2000;

        n10 = centavos / 1000;
        centavos %= 1000;

        n5 = centavos / 500;
        centavos %= 500;

        n2 = centavos / 200;
        centavos %= 200;

        m1 = centavos / 100;
        centavos %= 100;

        m05 = centavos / 50;
        centavos %= 50;

        m025 = centavos / 25;
        centavos %= 25;

        m010 = centavos / 10;
        centavos %= 10;

        m005 = centavos / 5;
        centavos %= 5;

        m001 = centavos;
        
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m05 + " moeda(s) de R$ 0.50");
        System.out.println(m025 + " moeda(s) de R$ 0.25");
        System.out.println(m010 + " moeda(s) de R$ 0.10");
        System.out.println(m005 + " moeda(s) de R$ 0.05");
        System.out.println(m001 + " moeda(s) de R$ 0.01");


        scanner.close();
    }
}