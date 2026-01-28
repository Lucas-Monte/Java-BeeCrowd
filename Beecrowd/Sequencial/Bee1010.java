import java.util.Scanner;
public class Bee1010 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String peca1 = scanner.nextLine();
        String peca2 = scanner.nextLine();
        String[] p1 = peca1.split(" ");
        String[] p2 = peca2.split(" ");
        int n1 = Integer.parseInt(p1[1]);
        double v1 = Double.parseDouble(p1[2]);
        int n2 = Integer.parseInt(p2[1]);
        double v2 = Double.parseDouble(p2[2]);
        double valorAPagar = (n1 * v1) + (n2 * v2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
    }
}