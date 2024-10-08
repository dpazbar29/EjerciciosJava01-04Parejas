package Ejercicios01;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();
        double euros = convertirPesetasAEuros(pesetas);
        System.out.printf("%.2f pesetas son %.2f euros\n", pesetas, euros);
        scanner.close();
    }

    public static double convertirPesetasAEuros(double pesetas) {
        return pesetas / 166.386;
    }
}
