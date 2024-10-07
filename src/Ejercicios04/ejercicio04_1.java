import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args) {
        String resultado = tirarDados();
        System.out.println(resultado);
    }

    public static String tirarDados() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;
        int sumaTotal = dado1 + dado2 + dado3;

        return "Dado 1: " + dado1 + ", Dado 2: " + dado2 + ", Dado 3: " + dado3 + ", Suma total: " + sumaTotal;
    }
}
