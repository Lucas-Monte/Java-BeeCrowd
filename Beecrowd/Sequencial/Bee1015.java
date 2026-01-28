import java.util.Scanner;
public class Bee1015{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       double a, b, c, d, dist;
       a = scanner.nextDouble();
       b = scanner.nextDouble();
       c = scanner.nextDouble();
       d = scanner.nextDouble();
       dist = Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));
       System.out.printf("%.4f\n", dist);


        scanner.close();
    }
}