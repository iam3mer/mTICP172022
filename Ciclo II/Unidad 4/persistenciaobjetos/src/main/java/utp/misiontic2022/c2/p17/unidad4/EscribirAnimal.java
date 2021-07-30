package utp.misiontic2022.c2.p17.unidad4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class EscribirAnimal {
    
    public static void escribir(String nomFile, List<Animal> animales) {

        FileOutputStream file = null;
        ObjectOutputStream oos = null;

        try {
            
             file = new FileOutputStream(nomFile);
             oos = new ObjectOutputStream(file);

            for (Animal animal : animales) {
                oos.writeObject(animal);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

}
