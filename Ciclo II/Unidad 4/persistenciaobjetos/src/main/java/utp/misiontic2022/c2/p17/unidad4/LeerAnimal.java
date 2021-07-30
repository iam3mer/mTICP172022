package utp.misiontic2022.c2.p17.unidad4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerAnimal {

    private Integer suma = 0;

    public void leer (String pathFile) {
        
        try (
            FileInputStream file = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(file);
        ) {

            Animal animal = (Animal) ois.readObject();

            while (animal != null) {

                if (animal instanceof Animal) {
                    System.out.println(animal);

                    setSuma(getSuma() + animal.getEdad());
                }

                animal = (Animal) ois.readObject();
            }
            
        } catch (EOFException e) {
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e){
            System.err.println(e);
        }
    }

    public Integer getSuma() {
        return suma;
    }

    public void setSuma(Integer suma) {
        this.suma = suma;
    }

    

}
