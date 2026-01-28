import java.util.Scanner;
public class TesteWhile {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n, resultado, i;
        System.out.println("Digite um numero: ");
        n = scanner.nextInt();

        i = 1;
        // while(i <= 10) {
        //     resultado = n * i;
        //     System.out.println(n + " x " + i + " = " + resultado);
        //     i++;
        // }
        do {
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);

        scanner.close();
    }
}