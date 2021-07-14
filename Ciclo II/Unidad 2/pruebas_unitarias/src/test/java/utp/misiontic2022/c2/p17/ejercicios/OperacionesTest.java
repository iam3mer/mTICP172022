package utp.misiontic2022.c2.p17.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperacionesTest {
    
    Operaciones operacion = new Operaciones();

    @Test
    @DisplayName("5 / 0 = -1")
    void dividir() {
        assertEquals(-1, operacion.dividir(5, 0));
    }
    
    @Test
    @DisplayName("5 + 2 = 7")
    void sumarDosNumeros() {
        assertEquals(7, operacion.sumar(5, 2));
    }

    @ParameterizedTest(name = "{index} => {0} + {1} = {2}")
    @CsvSource({
        "0,7,7",
        "2,3,8",
        "-5,2,-3"
    })
    void sumar(int num1, int num2, int result){
        assertEquals(result, operacion.sumar(num1, num2),
        () -> num1 + " * " + num2 + " = " + result);
    }

    @DisplayName("Pruebas Multiplicacion")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
        "2.0,0.0,0",
        "4.0,3.0,14",
        "5.0,3.0,15"
    })
    void multiplicar(double num1, double num2, int result) {
        assertEquals(result, operacion.multiplicacion(num1, num2),
            () -> num1 + " * " + num2 + " = " + result);
    }
}
