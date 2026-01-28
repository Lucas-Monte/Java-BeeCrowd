import java.util.Scanner;

public class TesteVetor{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double notas[];
        notas = new double[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nota do aluno %d = %.2f\n", i, notas[i]);
        }
        
        


        



        scanner.close();
    }
}