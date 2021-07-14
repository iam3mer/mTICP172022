package utp.misiontic2022.c2.p17.ejercicios;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws Throwable {
        try {
            ZeroDivision div = new ZeroDivision();
            div.Division(5, 0);
        } catch (ZeroDivision ex) {
            System.out.println(ex.getMessage());
        }

        InputStream inputstream = new FileInputStream("C:/Users/3mer/UTP/2021/MISIONTIC2021/Grupos/P17/Ciclo II/Unidad 2/excepciones/src/main/java/utp/misiontic2022/c2/p17/ejercicios/docu.txt");

        doio2(inputstream, System.out);

        /*
         * try { System.out.println( 4/0 ); Integer[] enteros =
         * {54545,578,54,2,475,4,56}; enteros[-8] = 10; } catch (ArithmeticException
         * exception) { System.out.println("No se puede dividir entre cero.");
         * System.out.println("Clase excepcion: " + exception.getClass().getName());
         * System.out.println("Mensaje excepcion: " + exception.getMessage()); } catch
         * (ArrayIndexOutOfBoundsException exception) {
         * System.out.println("Indice para el array incorrecto."); } finally {
         * System.out.println("Este bloque siempre se ejecuta."); }
         */
    }

    public static void doio2(InputStream in, OutputStream out) throws Throwable {
        int c;
        try {
            while ((c = in.read()) >= 0) {
                c = Character.toLowerCase((char) c);
                out.write(c);
            }
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            throw t;
        }
    }
}
