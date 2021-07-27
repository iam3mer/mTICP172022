package utp.misiontic2022.c2.unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IO_3 {
    public static void start() {
        String line = null;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out, true);

        output.println("Escriba un texto: ");
        try {
            line = input.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }
        output.println("El texto escrito es: ");
        output.println(line);
    }
}
