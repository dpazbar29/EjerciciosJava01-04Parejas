package Ejercicios01;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseImponible = scanner.nextDouble(); // Cambié a double para evitar truncamiento

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = scanner.next();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.next();

        String precioFinal = calcularPrecioFinal(baseImponible, tipoIva, codigoPromocional);

        if (!precioFinal.equals("Código no válido") && !precioFinal.equals("Descuento no válido")) {
            System.out.printf("Base imponible: %.2f\n", baseImponible);
            System.out.printf("Precio final: %s euros\n", precioFinal); // Usar %s para imprimir String
        } else {
            System.out.println(precioFinal); // Muestra el mensaje de error
        }

        scanner.close();
    }

    public static String calcularPrecioFinal(double baseImponible, String tipoIva, String codigoPromocional) {
        double iva;
        double descuento;

        switch (tipoIva.toLowerCase()) {
            case "general":
                iva = baseImponible * 0.21;
                break;
            case "reducido":
                iva = baseImponible * 0.10;
                break;
            case "superreducido":
                iva = baseImponible * 0.04;
                break;
            default:
                return "Código no válido"; // Mensaje de error para tipo de IVA
        }

        double precioConIva = baseImponible + iva;

        switch (codigoPromocional.toLowerCase()) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = precioConIva / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConIva * 0.05;
                break;
            default:
                return "Descuento no válido"; // Mensaje de error para código promocional
        }

        double total = precioConIva - descuento;
        return String.format("%.2f", total); // Devuelve el total como String formateado
    }
}
