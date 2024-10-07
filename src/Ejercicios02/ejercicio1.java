import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes): ");
        String dia = scanner.nextLine();

        String asignatura = obtenerAsignatura(dia);
        System.out.println("La asignatura que toca a primera hora el " + dia + " es: " + asignatura);
    }

    public static String obtenerAsignatura(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return "Matemáticas";
            case "martes":
                return "Historia";
            case "miércoles":
                return "Ciencias";
            case "jueves":
                return "Lengua";
            case "viernes":
                return "Educación Física";
            default:
                return "Día no válido. Debe ser Lunes, Martes, Miércoles, Jueves o Viernes.";
        }
    }
}
