package Ejercicios01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class tests {

    @Test
    public void testMultiplicar() {
        assertEquals(20, ejercicio1.multiplicar(4, 5), 0.001);
    }

    @Test
    public void testEurosAPesetas() {
        assertEquals(16638.6, ejercicio2.convertirEurosAPesetas(100), 0.1);
    }

    @Test
    public void testPesetasAEuros() {
        assertEquals(60.10, ejercicio3.convertirPesetasAEuros(10000), 0.01);
    }

    @Test
    public void testOperacionesBasicas() {
        String resultado = ejercicio4.realizarOperaciones(10, 5);
        assertTrue(resultado.contains("Suma: 15.00"));
        assertTrue(resultado.contains("Resta: 5.00"));
        assertTrue(resultado.contains("Multiplicación: 50.00"));
        assertTrue(resultado.contains("División: 2.00"));
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, ejercicio5.calcularAreaRectangulo(4, 5), 0.001);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(10, ejercicio6.calcularAreaTriangulo(4, 5), 0.001);
    }

    @Test
    public void testCalcularTotalFactura() {
        assertEquals(121, ejercicio7.calcularTotalFactura(100), 0.001);
    }

    @Test
    public void testCalcularSalarioSemanal() {
        assertEquals(480, ejercicio8.calcularSalarioSemanal(40), 0.001);
    }

    @Test
    public void testVolumenCono() {
        assertEquals(20.944, ejercicio9.calcularVolumenCono(2, 5), 0.001);
    }

    @Test
    public void testMbAKb() {
        assertEquals(1024, ejercicio10.convertirKbAMb(1), 0.001);
    }

    @Test
    public void testKbAMb() {
        assertEquals(1, ejercicio11.convertirKbAMb(1024), 0.001);
    }

    @Test
    public void testCalcularPrecioFinal() {
        String resultado = ejercicio12.calcularPrecioFinal(100, "reducido", "mitad");
        assertTrue(resultado.contains("Base imponible 100.00"));
        assertTrue(resultado.contains("IVA (10%) 10.00"));
        assertTrue(resultado.contains("Precio con IVA 110.00"));
        assertTrue(resultado.contains("Cód. promo. (mitad): -55.00"));
        assertTrue(resultado.contains("TOTAL 55.00"));
    }

    @Test
    public void testCalcularNotaNecesaria() {
        assertEquals(9.5, ejercicio13.calcularNotaSegundoExamen(7, 8.5), 0.01);
    }
}
