import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();

        String saludo = obtenerSaludo(hora);
        System.out.println(saludo);
    }

    public static String obtenerSaludo(int hora) {
        if (hora >= 6 && hora <= 12) {
            return "¡Buenos días!";
        } else if (hora >= 13 && hora <= 20) {
            return "¡Buenas tardes!";
        } else {
            return "¡Buenas noches!";
        }
    }
}
