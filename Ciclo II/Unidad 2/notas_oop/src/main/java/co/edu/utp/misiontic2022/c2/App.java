package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Materia materia = new Materia("Programación",4,40,50,39,76,96);

        materia.mostrarMateria();
        System.out.println();
        materia.mostrarPromedio();

    }
}
