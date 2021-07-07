package utp.misiontic2022.c2.p17.ejercicios;

public class Empleado extends Persona {
    // Atributos
    private Double sueldoBruto;
    private Double salud;
    private Double pension;
    private Double sueldoNeto;

    // Constructor
    public Empleado() {
        this.sueldoBruto = 0.0;
        this.salud = 0.0;
        this.pension = 0.0;
        this.sueldoNeto = 0.0;
    }

    public Empleado(Double pSueldoBruto, Double pSalud,
                Double pPension) {
        this.sueldoBruto = pSueldoBruto;
        this.salud = pSalud;
        this.pension = pPension;
    }

    // Metodos
    public Double calcularSueldoNeto() {
        this.sueldoNeto = this.sueldoBruto - this.salud - this.pension;
        return sueldoNeto;
    }

    @Override
    public void mostrar() {
        System.out.println("------InfoEmpleado------");
        System.out.println("Tipo de empleado: Operario");
        System.out.printf("Sueldo Bruto: %.2f", this.sueldoBruto);
        System.out.printf("Descuento por salud: %.2f", this.salud);
        System.out.printf("Descuento por pensión: %.2f", this.pension);
        System.out.printf("Sueldo Neto: %.2f", this.sueldoNeto);
    }

    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Double getPension() {
        return pension;
    }

    public void setPension(Double pension) {
        this.pension = pension;
    }

    public Double getSueldoNeto() {
        return sueldoNeto;
    }    
}
