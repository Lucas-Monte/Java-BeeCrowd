import java.util.Scanner;

public class Bee1040 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, n4, notaExame, media, mediaFinal;

        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        n4 = teclado.nextDouble();

        media = ((n1*2) + (n2*3) + (n3*4) + (n4*1))/(2+3+4+1);
        media = Math.floor(media *10.0) /10.0;

        System.out.printf("Media: %.1f\n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if(media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = teclado.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            mediaFinal = (media + notaExame)/2;
            mediaFinal = Math.floor(mediaFinal *10.0)/10.0;
            if(mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } 
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }

        teclado.close();
    }
}