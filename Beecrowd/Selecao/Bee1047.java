import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int hIni, mIni, hFin, mFin, resultado, minutosInicial, minutosFinal, horaTotal, minutosTotal;

        hIni = teclado.nextInt();
        mIni = teclado.nextInt();
        hFin = teclado.nextInt();
        mFin = teclado.nextInt();

        minutosInicial = hIni*60 + mIni;
        minutosFinal = hFin*60 + mFin;

        if(minutosFinal > minutosInicial){
            resultado = Math.abs(minutosInicial - minutosFinal);
        }
        else {
            resultado = (1440 - minutosInicial) + minutosFinal;
        }

        horaTotal = resultado/60;
        minutosTotal = resultado%60;
        

        System.out.println("O JOGO DUROU " + horaTotal + " HORA(S) E " + minutosTotal + " MINUTO(S)");


        teclado.close();
    }
}