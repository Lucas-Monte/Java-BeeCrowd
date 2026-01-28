import java.util.Scanner;

public class Bee1114{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x, senha = 2002;

        
        x = scanner.nextInt();

        while(x != senha) {
            System.out.println("Senha Invalida");
            x = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");




        scanner.close();
    }
}