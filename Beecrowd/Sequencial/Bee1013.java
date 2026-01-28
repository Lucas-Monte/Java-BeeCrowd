import java.util.Scanner;
public class Bee1013{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a, b, c, maiorAB, maiorABC;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");



        scanner.close();
    }
}