package utp.misiontic2022.c2.p17.unidad4.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.unidad4.controlador.Controlador;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.BookStock;

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
            System.out.println("5. Venta de libro");
            System.out.println("6. Salir");
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
                        venta();
                        break;
                    case "6":
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

    private static void create() {
        System.out.println("---Creación de Book---");

        try {
            System.out.print("Ingrese el titulo del libro: ");
            String title = input.readLine();
            System.out.print("Ingrese el isbn del libro: ");
            String isbn = input.readLine();
            System.out.print("Ingrese el año de publicación del libro: ");
            int year = Integer.valueOf(input.readLine());
            System.out.print("Cantidad de libros a stock: ");
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
        System.out.println("---Leer libro---");

        try {
            System.out.print("Ingrese el isbn del libro a mostrar: ");
            String isbn = input.readLine();

            Book book = controlador.readBook(isbn);

            if (book != null) {
                System.out.println(book);
            } else {
                System.out.printf("El libro con isbn %s no se encuentra en el catalogo!",isbn);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void update() {
        System.out.println("---Actualizar Libro---");

        try {
            System.out.print("Ingrese el isbn del libro a actualizar: ");
            String isbn = input.readLine();
            System.out.print("Ingrese el titulo del libro: ");
            String title = input.readLine();
            System.out.print("Ingrese el año de publicación: ");
            int year = Integer.valueOf(input.readLine());

            Book book = controlador.updateBook(isbn, title, year);

            if (book != null) {
                System.out.printf("El libro con isbn %s se actualizo correctamente!\n",isbn);
            } else {
                System.out.println("No se puede realizar la actualización.");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void delete() {
        System.out.println("---Eliminar Libro---");

        try {
            System.out.print("Ingrese el isbn del libro a elimiar: ");
            String isbn = input.readLine();

            boolean delete = controlador.deleteBook(isbn);

            if (delete) {
                System.out.printf("El libro con isbn %s fue eliminado!\n",isbn);
            } else {
                System.out.println("No se puede elimar el libro!");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void venta() {
        System.out.println("---Venta de Libro---");
        
        try {
            System.out.println("Catalogo disponible");
            ArrayList<BookStock> registrosBS = controlador.consultarCatalogoVenta();

            for (BookStock bookStock : registrosBS) {
                System.out.printf("%s %s %d %d\n",
                    bookStock.getTitle(),
                    bookStock.getIsbn(),
                    bookStock.getYear(),
                    bookStock.getAmount()
                    );
            }

            System.out.print("Ingrese el isbn del libro a vender: ");
            String isbn = input.readLine();
            System.out.print("Ingrese la cantidad de unidades a comprar: ");
            int unidades = Integer.valueOf(input.readLine());

            boolean venta = controlador.venderLibro(isbn, unidades);

            if (venta) {
                System.out.println("Venta realizada!");
            } else {
                System.out.println("No hay suficientes unidades para realizar la venta!");
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
