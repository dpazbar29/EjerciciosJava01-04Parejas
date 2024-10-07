import org.junit.Test;
import static org.junit.Assert.*;

public class ejercicio12Test {

    @Test
    public void obtenerNombreDia() {
        assertEquals("0 1 1", ejercicio12.obtenerFibonacci(3));
        assertEquals("0 1 1 2 3", ejercicio12.obtenerFibonacci(5));
    }
}
