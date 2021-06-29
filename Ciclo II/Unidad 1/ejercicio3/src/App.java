import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.println("Digite el numero: ");

        int numero = sc.nextInt();

        int resultado[] = ejemplo3(numero);

        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
    }

    public static int[] ejemplo3(int numero) {
        int doble = numero * 2;
        int triple = numero * 3;

        return new int[] {doble, triple};
    }

}
