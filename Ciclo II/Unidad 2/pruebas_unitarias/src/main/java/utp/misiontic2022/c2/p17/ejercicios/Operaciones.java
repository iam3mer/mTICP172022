package utp.misiontic2022.c2.p17.ejercicios;

public class Operaciones {

    public Operaciones () {}

    public int sumar (int num1, int num2){
        return num1 + num2;
    }

    public int multiplicacion(double num1, double num2) {
        return (int)(num1 * num2);
    }

    public int dividir(int num1, int num2) {
        try{
            return num1 / num2;
        } catch (ArithmeticException ex) {
            return -1;
        }
    }
}
