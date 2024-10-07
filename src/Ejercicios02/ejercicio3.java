import java.util.Scanner;

public class ejercicio3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String dia = obtenerNombreDia(numero);
        System.out.println("El día de la semana es: " + dia);
    }

    public static String obtenerNombreDia(int numero) {
        String dia;
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número no válido. Debe ser del 1 al 7.";
                break;
        }
        return dia;
    }
}
