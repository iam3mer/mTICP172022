package utp.misiontic2022.c2.p17.ejercicios;

public class Empresa {
    // Atributos
    private String nombre;

    // Constructores
    public Empresa() {
        this.nombre = "nomEmpresa";
    }

    public Empresa(String pNombre) {
        this.nombre = pNombre;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
