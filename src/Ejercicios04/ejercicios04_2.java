import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        String carta = obtenerCartaAleatoria();
        System.out.println(carta);
    }

    public static String obtenerCartaAleatoria() {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        String palo = palos[random.nextInt(palos.length)];
        String numero = numeros[random.nextInt(numeros.length)];

        return numero + " de " + palo;
    }
}
