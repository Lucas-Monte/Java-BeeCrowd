import java.util.Scanner;
public class Bee1035{
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        // (1) se B for maior do que C e 
        // (2) se D for maior do que A, e 
        // (3) a soma de C com D for maior que a soma de A e B e 
        // (4) se C e D, ambos, forem positivos e 
        // (5) se a variável A for par escrever a mensagem "Valores aceitos", senão 
        // (6) escrever "Valores nao aceitos".

        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } 
        else {
            System.out.println("Valores nao aceitos");
        }

        scanner.close();
    }
}