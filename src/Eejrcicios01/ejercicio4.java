import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : 0;
        System.out.printf("Suma: %.2f\n", suma);
        System.out.printf("Resta: %.2f\n", resta);
        System.out.printf("Multiplicación: %.2f\n", multiplicacion);
        if (num2 != 0) {
            System.out.printf("División: %.2f\n", division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
        scanner.close();
    }
}
