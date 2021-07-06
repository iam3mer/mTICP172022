package co.edu.utp.misiontic2022.c2;

public class Materia {

    // Atributos
    private String nombreMateria;
    private Integer numeroCredito;
    private Nota nota1;
    private Nota nota2;
    private Nota nota3;
    private Nota nota4;
    private Nota nota5;
    private Nota peorNota;
    private Integer promedio100;

    // Constructores
    public Materia() {
        /*
        this.nombreMateria = "nomMateria";
        this.numeroCredito = 0;
        this.nota1 = new Nota();
        this.nota2 = new Nota();
        this.nota3 = new Nota();
        this.nota4 = new Nota();
        this.nota5 = new Nota();
        */
        setNombreMateria("nomMateria");
        setNumeroCredito(0);
        setNota1(new Nota());
        setNota2(new Nota());
        setNota3(new Nota());
        setNota4(new Nota());
        setNota5(new Nota());
    }

    public Materia(String pNomMateria, Integer pNumeroCredito, Integer pNota1_100,
            Integer pNota2_100, Integer pNota3_100, Integer pNota4_100,
            Integer pNota5_100) {
                setNombreMateria(pNomMateria);
                setNumeroCredito(pNumeroCredito);
                setNota1(new Nota(pNota1_100));
                setNota2(new Nota(pNota2_100));
                setNota3(new Nota(pNota3_100));
                setNota4(new Nota(pNota4_100));
                setNota5(new Nota(pNota5_100));
            }

    // Metodos
    public void mostrarMateria() {
        System.out.println("------InfoMateria------");
        System.out.println("Nombre de la materia: " + getNombreMateria());
        nota1.mostrarNota();
        nota2.mostrarNota();
        nota3.mostrarNota();
        nota4.mostrarNota();
        nota5.mostrarNota();
    }

    public void mostrarPromedio() {
        this.calcularPromedio();
        System.out.println("------Promedio------");
        System.out.println("Nombre de la materia: " + getNombreMateria());
        Nota auxPromedio = new Nota(promedio100);
        auxPromedio.mostrarNota();
    }

    public void encontrarPeorNota() {
        setPeorNota(nota1);

        if (this.nota2.getEscala100() < this.peorNota.getEscala100()) {
            setPeorNota(nota2);
        }

        if (this.nota3.getEscala100() < this.peorNota.getEscala100()) {
            setPeorNota(nota3);
        }

        if (this.nota4.getEscala100() < this.peorNota.getEscala100()) {
            setPeorNota(nota4);
        }

        if (this.nota5.getEscala100() < this.peorNota.getEscala100()) {
            setPeorNota(nota5);
        }
        
    }

    public void calcularPromedio() {
        this.encontrarPeorNota();

        this.promedio100 = ((nota1.getEscala100() + nota2.getEscala100()
                        + nota3.getEscala100() + nota4.getEscala100()
                        + nota5.getEscala100() - peorNota.getEscala100()) / 4);

        //Nota auxNota = new Nota(this.promedio100);
        //this.promedioCualitativo = promedio100.getEscalaCualitativa();

        //this.promedio5 = promedio100.getEscala5();
    }



    public Integer getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(Integer numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Nota getNota1() {
        return nota1;
    }

    public void setNota1(Nota nota1) {
        this.nota1 = nota1;
    }

    public Nota getNota2() {
        return nota2;
    }

    public void setNota2(Nota nota2) {
        this.nota2 = nota2;
    }

    public Nota getNota3() {
        return nota3;
    }

    public void setNota3(Nota nota3) {
        this.nota3 = nota3;
    }

    public Nota getNota4() {
        return nota4;
    }

    public void setNota4(Nota nota4) {
        this.nota4 = nota4;
    }

    public Nota getNota5() {
        return nota5;
    }

    public void setNota5(Nota nota5) {
        this.nota5 = nota5;
    }

    
    public Nota getPeorNota() {
        return peorNota;
    }

    private void setPeorNota(Nota peorNota) {
        this.peorNota = peorNota;
    }
    
}
