package utp.misiontic2022.c2.p17.ejercicios;

public final class Directivo extends Empleado {
    // Atributo
    private String categoria;

    // Constructor
    public Directivo() {
        super();
        this.categoria = "Directivo";
    }

    public Directivo(Double pSueldoBruto, Double pSalud,
                Double pPension, String pCategoria) {
        super(pSueldoBruto, pSalud, pPension);
        this.categoria = pCategoria;
    }

    // Metodos
    @Override
    public void mostrar() {
        System.out.println("------InfoEmpleado------");
        System.out.printf("Tipo de empleado: %s", this.categoria);
        System.out.printf("Sueldo Bruto: %.2f", getSueldoBruto());
        System.out.printf("Descuento por salud: %.2f", getSalud());
        System.out.printf("Descuento por pensión: %.2f", getPension());
        System.out.printf("Sueldo Neto: %.2f", getSueldoNeto());
    }
}
