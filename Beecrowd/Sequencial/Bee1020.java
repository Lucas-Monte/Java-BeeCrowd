import java.util.Scanner;
public class Bee1020{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       int idadeDias, anos, meses, dias;
       idadeDias = scanner.nextInt();
       anos = idadeDias / 365;
       meses = (idadeDias % 365) / 30;
       dias = (idadeDias % 365) % 30;

       System.out.println(anos + " ano(s)");
       System.out.println(meses + " mes(es)");
       System.out.println(dias + " dia(s)");




        scanner.close();
    }
}