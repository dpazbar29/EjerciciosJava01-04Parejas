import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = calcularAreaRectangulo(base, altura);
        System.out.printf("El área del rectángulo es: %.2f\n", area);
        scanner.close();
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
