package utp.misiontic2022.c2.p17.unidad4;

import java.io.Serializable;

public class Animal implements Serializable {
    private String nombre;
    private String raza;
    private Integer edad;
    private String genero;

    public Animal(String nombre, String raza, Integer edad, String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return getNombre()+", "+getRaza()+" :"+getEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
