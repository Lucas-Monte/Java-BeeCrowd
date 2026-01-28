import java.util.Scanner;
public class Bee1019{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       int segundosTotal, horas, minutos, segundos;
       segundosTotal = scanner.nextInt();
       horas = segundosTotal / 3600;
       minutos = (segundosTotal % 3600) / 60;
       segundos = segundosTotal % 60;
       System.out.println(horas + ":" + minutos + ":" + segundos);




        scanner.close();
    }
}