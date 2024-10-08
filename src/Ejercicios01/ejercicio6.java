package Ejercicios01;
import java.util.Scanner;


public class ejercicio6 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Introduce la altura del triángulo: ");
            double altura = scanner.nextDouble();
            double area = calcularAreaTriangulo(base, altura);
            System.out.printf("El área del triángulo es: %.2f\n", area);
            scanner.close();
        }

        public static double calcularAreaTriangulo(double base, double altura) {
            return (base * altura) / 2;



        }
}
