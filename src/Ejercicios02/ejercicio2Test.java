import org.junit.Test;
import static org.junit.Assert.*;

public class ejercicio2Test {

    @Test
    public void obtenerSaludo() {
        assertEquals("¡Buenas tardes!", ejercicio2.obtenerSaludo(15));
        assertEquals("¡Buenos días!", ejercicio2.obtenerSaludo(8));
    }
}