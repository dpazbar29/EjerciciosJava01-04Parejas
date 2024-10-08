package Ejercicios02;

import org.junit.Test;
import static org.junit.Assert.*;

public class ejercicio1Test {

    @Test
    public void obtenerNombreDia() {
        assertEquals("Matemáticas", ejercicio1.obtenerAsignatura("Lunes"));
        assertEquals("Historia", ejercicio1.obtenerAsignatura("Martes"));
    }
}
