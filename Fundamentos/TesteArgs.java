public class TesteArgs{
    public static void main(String args[]) {
        System.out.println("Numero de elementos passados na linha de comando");
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Elemento = " + args[i]);
        }
    }
}