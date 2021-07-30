package utp.misiontic2022.c2.p17.unidad4;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeerArchivo {
    public static void leer(String pathFile) {
        File file = new File(pathFile);

        if (file.exists()) {
            
            try {
                
                Scanner input = new Scanner(file);

                while (input.hasNext()) {
                    StringTokenizer num = new StringTokenizer(input.next(), ",");
                    while (num.hasMoreTokens()) {
                        System.out.print(num.nextToken() + "\t");
                    }
                    System.out.println();
                }

                input.close();

            } catch (Exception e) {
                //TODO: handle exception
            }

        } else {
            System.out.println("El archivo no existe");
        }
    }
}
