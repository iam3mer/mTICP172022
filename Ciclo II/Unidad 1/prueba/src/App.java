import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Hello, "+args[0]+" "+apellido+"!");
        */

        String num = "";
        //int contador = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);

            num = sc.nextLine();

            // Estructuras de Control

            if (num.equals("10")) {
                System.out.println("1. El numero es "+num+".");
            } else if (num.equals("12")) {
                System.out.println("2. El numero es 12.");
            } else {
                System.out.println("3. Cualquier otro numero.");
            }

            switch (num) {
                case "10":
                    System.out.println("1. El numero es 10.");
                    break;
                case "12":
                    System.out.println("2. El numero es 12.");
                    break;
                default:
                    System.out.println("3. Cualquier otro numero.");
                    break;
            }

            // Estructuras de repetición

            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }

            int num2 = 0;
            do {
                System.out.println("Al menos me imprimo una vez.");
                num2++;
            } while (num2 < 4);

            // continue;

            int numI = Integer.valueOf(num); // El cambio de tipo de dato se debe almacenar en una variable del mismo tipo

            if (num instanceof String) {
                System.out.println("Es de tipo String.");
            } else {
                System.out.println("No es de tipo String.");
            }

            // System.out.println(numI.getClass()); // Se debe enmascarar en un objeto para poder usarse

            break;

            //contador += 1;
        }

    }

}
