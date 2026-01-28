import java.util.Scanner;

public class TesteForEach{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int elemento : a) {
            System.out.println("Elemento do vetor = " + elemento);
        }



        scanner.close();
    }
}