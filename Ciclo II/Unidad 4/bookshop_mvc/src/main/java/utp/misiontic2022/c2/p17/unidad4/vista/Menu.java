package utp.misiontic2022.c2.p17.unidad4.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utp.misiontic2022.c2.p17.unidad4.controlador.Controlador;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;

public class Menu {

    private static final Controlador controlador;
    private static final BufferedReader input;

    static {
        controlador = new Controlador();
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void iniciar() {
        boolean loop = true;
        while (loop) {
            System.out.println("-------CRUD Book-------");
            System.out.println("1. Crear libro");
            System.out.println("2. Leer libro");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                String opcion = input.readLine();
                switch (opcion) {
                    case "1":
                        create();
                        break;
                    case "2":
                        //read();
                        break;
                    case "3":
                        //update();
                        break;
                    case "4":
                        //delete();
                        break;
                    case "5":
                        loop = false;
                        break;
                    default:
                        System.err.println("La opción no es valida");
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

        }
    }

    private static void create() throws IOException {
        System.out.println("---Creación de Book---");

        System.out.print("Ingrese el titulo del libro: ");
        String title = input.readLine();
        System.out.print("Ingrese el isbn del libro: ");
        String isbn = input.readLine();
        System.out.print("Ingrese el año de publicación del libro: ");
        int year = Integer.valueOf(input.readLine());

        Book book = controlador.createBook(title, isbn, year);

        if (book != null) {
            System.out.println("Libro creado correctamente!");
        } else {
            System.out.println("El libro ya se encuentra en la base de datos.");
        }
    }
}
