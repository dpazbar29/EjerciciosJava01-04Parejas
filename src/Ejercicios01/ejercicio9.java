package Ejercicios01;
import java.util.Scanner;

public class ejercicio9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el radio del cono: ");
            double radio = scanner.nextDouble();
            System.out.print("Introduce la altura del cono: ");
            double altura = scanner.nextDouble();
            double volumen = calcularVolumenCono(radio, altura);
            System.out.printf("El volumen del cono es: %.2f\n", volumen);
            scanner.close();
        }

        public static double calcularVolumenCono(double radio, double altura) {
            return (1.0 / 3) * Math.PI * Math.pow(radio, 2) * altura;
        }
}

