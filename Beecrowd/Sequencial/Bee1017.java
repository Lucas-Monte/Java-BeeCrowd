import java.util.Scanner;
public class Bee1017{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       int tempo, velocidade, km;
       double litros;
       tempo = scanner.nextInt();
       velocidade = scanner.nextInt();
        km = tempo * velocidade;
        litros = km / 12.00;
        System.out.printf("%.3f\n", litros);



        scanner.close();
    }
}