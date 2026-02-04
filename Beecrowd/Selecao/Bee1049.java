import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Bee1049 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String palavra1, palavra2, palavra3, animal;

        palavra1 = teclado.nextLine();
        palavra2 = teclado.nextLine();
        palavra3 = teclado.nextLine();
        

        switch(palavra1) {
            case "vertebrado":
                if(palavra2.equals("ave") && palavra3.equals("carnivoro")) {
                    animal = "aguia";
                } else if(palavra2.equals("ave") && palavra3.equals("onivoro")) {
                    animal = "pomba";
                } else if(palavra2.equals("mamifero") && palavra3.equals("onivoro")) {
                    animal = "homem";
                } else {
                    animal = "vaca";
                }
                break;
            case "invertebrado":
                if(palavra2.equals("inseto") && palavra3.equals("hematofago")) {
                    animal = "pulga";
                } else if(palavra2.equals("inseto") && palavra3.equals("herbivoro")){
                    animal = "lagarta";
                } else if(palavra2.equals("anelideo") && palavra3.equals("hematofago")) {
                    animal = "sanguessuga";
                } else {
                    animal = "minhoca";
                }
                break;
            default:
                animal = "";
        }

        System.out.println(animal);

        teclado.close();
    }
}