import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double salarioSemanal = calcularSalarioSemanal();
        System.out.println("El salario semanal es: " + salarioSemanal + " euros.");
    }

    public static double calcularSalarioSemanal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();

        double salario = 0;
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 12;
        } else {
            salario = (40 * 12) + ((horasTrabajadas - 40) * 16);
        }

        return salario;
    }
}
