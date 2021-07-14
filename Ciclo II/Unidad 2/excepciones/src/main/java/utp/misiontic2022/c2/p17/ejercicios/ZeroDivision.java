package utp.misiontic2022.c2.p17.ejercicios;

public class ZeroDivision extends Exception {
    private int n;

    ZeroDivision () {}
    ZeroDivision(String msj) {
        super(msj);
    }
    
    public void setNumerator(int _n){
        this.n = _n;
    }

    public void Division (int n, int d) throws ZeroDivision {
        if (d == 0) {
            var myExcept = new ZeroDivision("---No se puede divir entre cero.");
    
           myExcept.setNumerator(n);
           throw myExcept; 
        }
    }
}
