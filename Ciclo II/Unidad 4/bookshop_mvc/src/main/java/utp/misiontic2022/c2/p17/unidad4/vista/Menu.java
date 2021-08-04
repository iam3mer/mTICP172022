package utp.misiontic2022.c2.p17.unidad4.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

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
                        read();
                        break;
                    case "3":
                        update();
                        break;
                    case "4":
                        delete();
                        break;
                    case "5":
                        loop = false;
                        break;
                    default:
                        System.err.println("La opción no es valida");
                }
            } catch (Exception e) {
                System.err.println(e);
            }

        }
    }

    private static void create() throws IOException {
        System.out.println("---Creación de Libro---");

        try {
            System.out.print("Ingrese el titulo del libro: ");
            String title = input.readLine();
            System.out.print("Ingrese el isbn del libro: ");
            String isbn = input.readLine();
            System.out.print("Ingrese el año de publicación del libro: ");
            int year = Integer.valueOf(input.readLine());
            System.out.print("Ingrese las unidades del stock: ");
            int amount = Integer.valueOf(input.readLine());

            Book book = controlador.createBook(title, isbn, year);

            if (book != null) {
                controlador.createStock(isbn, amount);
                System.out.println("Libro creado correctamente!");
            } else {
                System.out.println("El libro ya se encuentra en la base de datos.");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static void read() {
        System.out.println("---Consulta de Libro---");

        try {
            System.out.print("Ingrese el ISBN del libro a consultar: ");
            String isbn = input.readLine();
            
            Book book = controlador.readBook(isbn);

            if (book != null) {
                System.out.println(book);
            } else {
                System.err.println("El libro buscado no existe!");
            }
        } catch (SQLException | IOException e) {
            System.err.println(e);
        }
    }

    public static void update() {
        System.out.println("---Actualizar Libro---");

        try {
            System.out.print("Ingrese el isbn del libro a actualizar: ");
            String isbn = input.readLine();
            System.out.print("Ingrese el nombre del libro: ");
            String title = input.readLine();
            System.out.print("Ingrese el año de publicación: ");
            int year = Integer.valueOf(input.readLine());

            boolean band = controlador.updateBook(isbn, title, year);

            if (band) {
                System.out.printf("El libro con isbn (%s) fue actualizado!\n", isbn);
            } else {
                System.out.println("No es posible actualizar el libro!");
            }

        } catch (SQLException | IOException e) {
            System.err.println(e);
        }
    }

    public static void delete() {
        System.out.println("Eliminar un libro");
        try {
            System.out.print("Ingrese el isbn del libro a eliminar: ");
            String isbn = input.readLine();

            boolean band = controlador.deleteBook(isbn);

            if (band) {
                System.out.printf("El libro con isbn (%s) fue eliminado.\n", isbn);
            } else {
                System.out.printf("No se puede eliminar (%s)!.\n", isbn);
            }
        } catch (SQLException | IOException e) {
            System.err.println(e);
        }
    }

}
