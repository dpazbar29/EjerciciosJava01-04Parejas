package Ejercicios01;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        double salario = calcularSalarioSemanal(horasTrabajadas);
        System.out.printf("El salario semanal es: %.2f euros\n", salario);
        scanner.close();
    }

    public static double calcularSalarioSemanal(int horasTrabajadas) {
        double salarioBase = 12;
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            return (40 * salarioBase) + (horasExtras * 16);
        }
        return horasTrabajadas * salarioBase;
    }

}
