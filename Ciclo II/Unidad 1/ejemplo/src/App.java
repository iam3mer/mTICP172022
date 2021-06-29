public class App {
    public static void main(String[] args) throws Exception {
        var nombre = "Jhonatan Barrera";

        var resultado = saludar(nombre);

        System.out.println(resultado);
    }

    public static String saludar(String nombre) {
        return "Hola " + nombre + "!";
    }
}
