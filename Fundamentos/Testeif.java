import java.util.Scanner;

public class Testeif {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, me;
        System.out.println("Digite o N1: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o N2: ");
        n2 = scanner.nextDouble();

        me = (n1 + n2) / 2;

        System.out.printf("A média é %.2f\n", me);

        if (n1 >= 5 && me >= 6.0) {
            System.out.println("Parabens!! Aprovado!");
        }
        else {
            System.out.println("Reprovado!!");
        }
        scanner.close();
        
    }
}