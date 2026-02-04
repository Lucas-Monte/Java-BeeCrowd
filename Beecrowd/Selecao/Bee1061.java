import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1061 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        String diaComeco, horarioComeco, diaFim, horarioFim;
        int diaInicial, diaFinal, segundosInicialTotal, segundosFinalTotal, horasInicial, minutosInicial, segundosInicial, horasFinal, minutosFinal, segundosFinal, diasTotal, horaTotal, minutosTotal, segundosTotal, segundosRestante, resto; 

        diaComeco = teclado.nextLine();
        horarioComeco = teclado.nextLine();
        diaFim = teclado.nextLine();
        horarioFim = teclado.nextLine();

        diaInicial = Integer.parseInt(diaComeco.substring(4));
        diaFinal = Integer.parseInt(diaFim.substring(4));

        String[] partesInicial = horarioComeco.split(" : ");
        horasInicial = Integer.parseInt(partesInicial[0]);
        minutosInicial = Integer.parseInt(partesInicial[1]);
        segundosInicial = Integer.parseInt(partesInicial[2]);

        String[] partesFinal = horarioFim.split(" : ");
        horasFinal = Integer.parseInt(partesFinal[0]);
        minutosFinal = Integer.parseInt(partesFinal[1]);
        segundosFinal = Integer.parseInt(partesFinal[2]);

        segundosInicialTotal = (diaInicial*86400) + (horasInicial * 3600) + (minutosInicial*60) + segundosInicial;
        segundosFinalTotal = (diaFinal*86400) + (horasFinal * 3600) + (minutosFinal*60) + segundosFinal;

        segundosRestante = Math.abs(segundosInicialTotal - segundosFinalTotal);

        diasTotal = segundosRestante/86400;
        resto = segundosRestante % 86400;
        horaTotal = resto / 3600;
        resto = resto % 3600;
        minutosTotal = resto / 60;
        resto = resto % 60;
        segundosTotal = resto;


        System.out.println(diasTotal + " dia(s)");
        System.out.println(horaTotal + " hora(s)");
        System.out.println(minutosTotal + " minuto(s)");
        System.out.println(segundosTotal + " segundo(s)");

        teclado.close();
    }
}