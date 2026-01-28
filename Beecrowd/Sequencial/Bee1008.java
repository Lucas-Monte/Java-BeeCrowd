import java.util.Scanner;

public class Bee1008 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        double s = scanner.nextDouble();
        double salary = h * s;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}