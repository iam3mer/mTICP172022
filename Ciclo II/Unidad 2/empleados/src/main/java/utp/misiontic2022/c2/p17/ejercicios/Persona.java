package utp.misiontic2022.c2.p17.ejercicios;

public abstract class Persona {
    // Atributos
    private String nombre;
    private Integer edad;

    // Constructor
    public Persona() {
        this.nombre = "Nombre Persona";
        this.edad = 0;
    }

    public Persona(String pNombre, Integer pEdad) {
        this.nombre = pNombre;
        this.edad = pEdad;
    }

    // Metodos
    public abstract void mostrar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
}
