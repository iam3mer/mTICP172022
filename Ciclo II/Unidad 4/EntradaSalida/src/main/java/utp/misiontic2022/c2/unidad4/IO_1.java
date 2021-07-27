package utp.misiontic2022.c2.unidad4;

import java.io.IOException;

public class IO_1 {
    
    public static void start() {
        int numBytes = 0;
        char caracter;

        System.out.println("Escriba un texto: ");

        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n');
            System.out.printf("%d bytes leidos \n", numBytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
