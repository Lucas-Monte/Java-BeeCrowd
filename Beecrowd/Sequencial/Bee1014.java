import java.util.Scanner;
public class Bee1014{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double cons, y = scanner.nextDouble();
        cons = x / y;

        System.out.printf("%.3f km/l\n", cons);

        scanner.close();
    }
}