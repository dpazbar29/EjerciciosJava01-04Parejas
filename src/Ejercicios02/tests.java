package Ejercicios02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EjerciciosSwitchTest {

    // Ejercicio 1
    @ParameterizedTest
    @CsvSource({
            "lunes, Matemáticas",
            "martes, Lengua",
            "miércoles, Inglés",
            "jueves, Ciencias",
            "viernes, Historia",
            "sábado, Día no válido"
    })
    void testAsignaturaPorDia(String dia, String expectedAsignatura) {
        assertEquals(expectedAsignatura, ejercicio1.asignaturaPorDia(dia));
    }

    // Ejercicio 2
    @ParameterizedTest
    @CsvSource({
            "6, Buenos días",
            "12, Buenos días",
            "13, Buenas tardes",
            "20, Buenas tardes",
            "21, Buenas noches",
            "5, Buenas noches",
            "24, Hora no válida"
    })
    void testSaludoPorHora(int hora, String expectedSaludo) {
        assertEquals(expectedSaludo, ejercicio2.saludoPorHora(hora));
    }

    // Ejercicio 3
    @ParameterizedTest
    @CsvSource({
            "1, Lunes",
            "2, Martes",
            "3, Miércoles",
            "4, Jueves",
            "5, Viernes",
            "6, Sábado",
            "7, Domingo",
            "8, Número no válido"
    })
    void testNombreDiaSemana(int numero, String expectedDia) {
        assertEquals(expectedDia, ejercicio3.nombreDiaSemana(numero));
    }

    // Ejercicio 4
    @ParameterizedTest
    @CsvSource({
            "35, 420",
            "40, 480",
            "45, 560"
    })
    void testCalcularSalarioSemanal(int horas, double expectedSalario) {
        assertEquals(expectedSalario, ejercicio4.calcularSalarioSemanal(horas), 0.01);
    }

    // Ejercicio 15
    @Test
    void testDibujarPiramide() {
        String expectedPiramide =
                "  *  \n" +
                        " *** \n" +
                        "*****\n";
        assertEquals(expectedPiramide, EjerciciosSwitch.dibujarPiramide('*', "arriba", 3));
    }

    // Ejercicio 16
    @Test
    void testCalcularProbabilidadInfidelidad() {
        // Este test dependerá de cómo implementes el cálculo
        assertTrue(EjerciciosSwitch.calcularProbabilidadInfidelidad() >= 0 && EjerciciosSwitch.calcularProbabilidadInfidelidad() <= 100);
    }

    // Ejercicio 17
    @ParameterizedTest
    @ValueSource(ints = {123, 456, 789, 1000})
    void testObtenerUltimaCifra(int numero) {
        assertEquals(numero % 10, EjerciciosSwitch.obtenerUltimaCifra(numero));
    }

    // Ejercicio 18
    @ParameterizedTest
    @CsvSource({
            "12345, 1",
            "67890, 6",
            "9, 9"
    })
    void testObtenerPrimeraCifra(int numero, int expectedPrimeraCifra) {
        assertEquals(expectedPrimeraCifra, EjerciciosSwitch.obtenerPrimeraCifra(numero));
    }

