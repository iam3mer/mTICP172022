package utp.misiontic2022.c2.p17.unidad4;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EscribirAnimal.escribir(
            "animales.data",
            Arrays.asList(
                new Animal("Lazzy", "Poodle", 15, "Hembra"),
                new Animal("Felix", "Criollo", 5, "Macho"),
                new Animal("Luna", "Criollo", 1, "Hembra"),
                new Animal("Lukas", "Cocker", 9, "Macho")
            ));

        LeerAnimal animal = new LeerAnimal();
        animal.leer("animales.data");
        System.out.printf("La suma de las edades es: %d\n", animal.getSuma());
    }
}
