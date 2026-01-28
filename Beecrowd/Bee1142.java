import java.util.Scanner;

public class Bee1142{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        int aux = 1;

        for (int i = 0; i < linhas; i++) {
            System.out.println(aux + " " + (aux+1) + " " + (aux+2) + " PUM");
            aux += 4;
        }




        scanner.close();
    }
}