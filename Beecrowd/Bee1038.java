import java.util.Scanner;
public class Bee1038{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int cod, qtd;
        double valor;

        cod = scanner.nextInt();
        qtd = scanner.nextInt();

        // if (cod == 1) {
        //     valor = qtd * 4.00;
        // } 
        // else if (cod == 2) {
        //     valor = qtd * 4.50;
        // } 
        // else if (cod == 3) {
        //     valor = qtd * 5.00;
        // } 
        // else if (cod == 4) {
        //     valor = qtd * 2.00;
        // } 
        // else {
        //     valor = qtd * 1.50;
        // }

        switch(cod) {
            case 1:
                valor = qtd * 4.00;
                break;
            case 2:
                valor = qtd * 4.50;
                break;
            case 3:
                valor = qtd * 5.00;
                break;
            case 4:
                valor = qtd * 2.00;
                break;
            default:
                valor = qtd * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", valor);


        scanner.close();
    }
}