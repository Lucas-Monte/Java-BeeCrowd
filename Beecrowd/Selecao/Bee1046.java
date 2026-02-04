import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1046 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int inicio, fim, resultado;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if(inicio > fim) {
            inicio = 24 - inicio;
            resultado = inicio + fim;
        } else if(inicio < fim) {
            resultado = fim - inicio;
        } else {
            resultado = 24;
        }

        System.out.println("O JOGO DUROU " + Math.abs(resultado) + " HORA(S)");

        teclado.close();
    }
}