package utp.misiontic2022.c2.p17.unidad4;

import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivo {
    public static void escibir() {
        int[][] num = {{5345,345,3453,453,45},
                        {34,5345,345,345,345,3546},
                        {345,345,345,345}};

        String file = "numerosMat.txt";

        try {
            PrintWriter output = new PrintWriter(file);

            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    output.print(num[i][j] + ",");
                }
                output.println();
            }

            output.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
