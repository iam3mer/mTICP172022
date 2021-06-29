import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digita un numero: ");

        var sc = new Scanner(System.in);
        var numero = sc.nextInt();

        var simbolos = cuentaSimbolos(numero);

        System.out.println(numero+" tiene "+simbolos+" Simbolo(s).");

    }

    public static int cuentaSimbolos(int numero) {
        var cifras = numero == 0 ? 1 : 0;

        while (numero != 0) {
            numero = numero / 10;
            cifras++;
        }

        return cifras;
    }

}
