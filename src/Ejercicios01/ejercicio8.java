package Ejercicios01;
import java.util.Scanner;

public class ejercicio8 {



    public class SalarioSemanal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce las horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            double salario = calcularSalarioSemanal(horasTrabajadas);
            System.out.printf("El salario semanal es: %.2f euros\n", salario);
            scanner.close();
        }

        public static double calcularSalarioSemanal(int horasTrabajadas) {
            return horasTrabajadas * 12;
        }
    }


}
