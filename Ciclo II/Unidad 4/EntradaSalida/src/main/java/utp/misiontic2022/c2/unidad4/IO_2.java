package utp.misiontic2022.c2.unidad4;

import java.io.IOException;

public class IO_2 {
    public static void start() {
        byte[] buffer = new byte[255];

        System.out.println("Escribe un texto: ");

        try {
            System.in.read(buffer, 0, 255);
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("El texto escrito es: ");
        System.out.println(new String(buffer));
    }
}
