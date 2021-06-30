package xyz.iam3mer.baorjs.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Ingrese una fecha: " ); // 12/07/1980

        String fecha = input.nextLine();

        int indiceSeparador1 = fecha.indexOf('/');

        int dia = Integer.parseInt(fecha.substring(0,indiceSeparador1));

        int indiceSeparador2 = fecha.lastIndexOf('/');

        int mes = Integer.parseInt(fecha.substring(++indiceSeparador1,indiceSeparador2));

        int anio = Integer.parseInt(fecha.substring(indiceSeparador2+1,fecha.length()));

        int auxSuerte = dia + mes + anio;

        int digito = 0;
        int numeroSuerte = 0;

        while (auxSuerte != 0) {
            digito = auxSuerte % 10;
            numeroSuerte += digito;
            auxSuerte /= 10;
        }

        System.out.printf("El numero de la suerte para %s es %d", fecha, numeroSuerte);

        input.close();
    }
}
