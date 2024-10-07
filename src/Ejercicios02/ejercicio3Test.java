import org.junit.Test;
import static org.junit.Assert.*;

public class ejercicio3Test {

    @Test
    public void obtenerNombreDia() {
        assertEquals("Lunes", ejercicio3.obtenerNombreDia(1));
        assertEquals("Martes", ejercicio3.obtenerNombreDia(2));
    }
}
