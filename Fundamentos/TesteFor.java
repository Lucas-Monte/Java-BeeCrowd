import java.util.Scanner;
public class TesteFor{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n, resultado;
        System.out.println("Digite um numero: ");
        n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }


        scanner.close();
    }
}