import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.printf("La multiplicación de %.2f y %.2f es: %.2f\n", num1, num2, resultado);
        scanner.close();
    }
}
