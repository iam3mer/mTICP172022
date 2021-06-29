import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        Scanner sc = new Scanner(System.in);

        double C = sc.nextDouble();

        double resultado = fahrenheit(C);

        System.out.println(C + " grados Centigrados son "+ resultado + " grados Fahrenheit.");
    }

    public static double fahrenheit(double grados) {
        double F = 32 + (9 * grados / 5);
        return F;
    }
}
