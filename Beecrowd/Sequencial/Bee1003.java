import java.util.Scanner;
public class Bee1003 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A, B, soma;

        A = scanner.nextInt();    
        B = scanner.nextInt();
        soma = A + B;

        System.out.println("SOMA = " + soma);


        scanner.close();
    }
}