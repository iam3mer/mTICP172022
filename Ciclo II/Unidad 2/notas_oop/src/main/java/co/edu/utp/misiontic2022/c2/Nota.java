package co.edu.utp.misiontic2022.c2;

public class Nota {

    // Atributos
    private Integer escala100;
    private Double escala5;
    private String escalaCualitativa;

    // Constructores
    Nota() {
        this.escala100 = 0;
        this.escala5 = 0.0;
        this.escalaCualitativa = "";
    }

    Nota(Integer pEscala100) {
        //this.escala100 = pEscala100;
        setEscala100(pEscala100);
        //this.escala5 = pEscala100 * 0.05
        setEscala5(pEscala100 * 0.05);
        if (pEscala100 >= 60) {
            //this.escalaCualitativa = "Aprobado";
            setEscalaCualitativa("Aprobado");
        } else {
            //this.escalaCualitativa = "Reprobo";
            setEscalaCualitativa("Reprobado");
        }
    }
    
    Nota(Double pEscala5) {
        //this.escala100 = pEscala5 * 20;
        //setEscala100(Integer.parseInt(Double.toString(pEscala5)) * 20);
        setEscala100((int)(pEscala5 * 20));
        //this.escala5 = pEscala5;
        setEscala5(pEscala5);
        if (pEscala5 >= 3.0) {
            //this.escalaCualitativa = "Aprobado";
            setEscalaCualitativa("Aprobado");
        } else {
            //this.escalaCualitativa = "Reprobo";
            setEscalaCualitativa("Reprobado");
        }
    }

    // Metodos
    public void mostrarNota() {
        System.out.println("------EscalaNotas------");
        System.out.printf("Nota en escala de 5 : %.2f\n", this.escala5);
        System.out.printf("Nota en escala de 100: %d\n", getEscala100());
        System.out.printf("Nota en escala cualitativa: %s\n", this.escalaCualitativa);
    }

    public Integer getEscala100() {
        return escala100;
    }

    public void setEscala100(Integer escala100) {
        this.escala100 = escala100;
    }

    public Double getEscala5() {
        return escala5;
    }

    public void setEscala5(Double escala5) {
        this.escala5 = escala5;
    }

    public String getEscalaCualitativa() {
        return escalaCualitativa;
    }

    public void setEscalaCualitativa(String escalaCualitativa) {
        this.escalaCualitativa = escalaCualitativa;
    }

    
    
}
