package Ejercicios02;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes): ");
        String dia = scanner.nextLine();

        String asignatura = asignaturaPorDia(dia);
        System.out.println("La asignatura que toca a primera hora el " + dia + " es: " + asignatura);
    }

    public static String asignaturaPorDia(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return "Matemáticas";
            case "martes":
                return "Lengua";
            case "miércoles":
                return "Inglés";
            case "jueves":
                return "Ciencias";
            case "viernes":
                return "Historia";
            default:
                return "Día no válido";
        }
    }
}
