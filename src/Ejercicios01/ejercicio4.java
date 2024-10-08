package Ejercicios01;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        String resultado = realizarOperaciones(num1, num2);
        System.out.println(resultado);

        scanner.close();
    }

    public static String realizarOperaciones(double num1, double num2) {
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        String division;

        if (num2 != 0) {
            division = String.valueOf(num1 / num2);
        } else {
            division = "No se puede dividir entre cero.";
        }

        return "Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multiplicacion + "\nDivisión: " + division;
    }
}
