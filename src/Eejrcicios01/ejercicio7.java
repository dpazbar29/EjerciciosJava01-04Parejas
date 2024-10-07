import java.util.Scanner;

public class ejercicio7 {

    public class TotalFactura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la base imponible: ");
            double baseImponible = scanner.nextDouble();
            double total = calcularTotalFactura(baseImponible);
            System.out.printf("El total de la factura es: %.2f euros\n", total);
            scanner.close();
        }

        public static double calcularTotalFactura(double baseImponible) {
            return baseImponible * 1.21;
        }
    }


}
