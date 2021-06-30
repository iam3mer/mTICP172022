package xyz.iam3mer.baorjs.ejercicios;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ejercicio2 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "Ingrese el valor del producto: " );
        int precio = input.nextInt();

        System.out.println("Ingrese la cantidad: ");
        int cantidad = input.nextInt();

        System.out.println("Ingrese el porcentaje de iva (sin %): ");
        int iva = input.nextInt();

        input.close();

        int precioIVA = precio + (precio * iva / 100);
        
        int total = precioIVA * cantidad;

        System.out.printf("El precio del prodcuto es: %d", total);

    }
}
