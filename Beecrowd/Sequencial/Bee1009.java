import java.util.Scanner;

public class Bee1009 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        String nome = scanner.nextLine();
        double fixo = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double comissao = vendas * 0.15;
        double salario = fixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salario);



    }
}