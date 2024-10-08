package Ejercicios03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class EjerciciosBuclesTest {

    // Test Ejercicio 12
    @Test
    public void testEjercicio12() {
        List<Integer> esperados = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(esperados, ejercicio12.obtenerFibonacci(6));
    }

    // Test Ejercicio 15
    @Test
    public void testEjercicio15() {
        List<Double> esperados = Arrays.asList(2.0, 4.0, 8.0, 16.0, 32.0);
        assertEquals(esperados, ejercicio15.calcularPotencias(2, 5));
    }


    // Test Ejercicio 19


    @Test
    public void testEjercicio19() {
        List<String> esperados = Arrays.asList(
                "    *",
                "   ***",
                "  *****",
                " *******",
                "*********"
        );
        assertEquals(esperados, ejercicio19.crearPiramide(5, '*'));

        esperados = Arrays.asList(
                "   #",
                "  ###",
                " #####",
                "#######"
        );
        assertEquals(esperados, ejercicio19.crearPiramide(4, '#'));

        esperados = Arrays.asList(
                "  @",
                " @@@",
                "@@@@@"
        );
        assertEquals(esperados, ejercicio19.crearPiramide(3, '@'));
    }

}


