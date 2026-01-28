import java.util.Scanner;

public class Leitura {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        /*
        int a;
        float b;
        double c;

        System.out.println("Por favor, digite um numero inteiro: ");
        a = teclado.nextInt();
        System.out.println("Você digitou o valor " + a);
        System.out.println("Por favor, digite um numero float: ");
        b = teclado.nextFloat();
        System.out.println("Você digitou o valor " + b);
        System.out.println("Por favor, digite um numero double: ");
        c = teclado.nextDouble();
        System.out.printf("Você digitou o valor %.3f\n", c);
        */

       String nome;
       int codigo;
       double salario;

       System.out.println("Digite seu codigo: ");
       codigo = Integer.parseInt(teclado.nextLine());
       System.out.println("Digite seu nome: ");
       nome = teclado.nextLine();
       System.out.println("Digite seu salario: ");
       salario = Double.parseDouble(teclado.nextLine());
       System.out.println("Seu codigo, nome e salario: " + codigo + " - " + nome + " - R$ " + salario);












        teclado.close();
    }
}