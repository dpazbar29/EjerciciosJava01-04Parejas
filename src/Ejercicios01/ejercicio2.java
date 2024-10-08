package Ejercicios01;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();
        double pesetas = convertirEurosAPesetas(euros);
        System.out.printf("%.2f euros son %.2f pesetas\n", euros, pesetas);
        scanner.close();
    }

    public static double convertirEurosAPesetas(double euros) {
        return euros * 166.386;
    }
}
