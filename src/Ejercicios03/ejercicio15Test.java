import org.junit.Test;
import static org.junit.Assert.*;

public class ejercicio15Test {

    @Test
    public void calcularPotencias() {
        assertEquals("2.0 ^ 1 = 2.0\n" +
                "2.0 ^ 2 = 4.0\n" +
                "2.0 ^ 3 = 8.0", ejercicio15.calcularPotencias(2.0,3));
        assertEquals("3.0 ^ 1 = 3.0\n" +
                "3.0 ^ 2 = 9.0\n" +
                "3.0 ^ 3 = 27.0", ejercicio15.calcularPotencias(3.0,3));
    }
}
