import java.util.Scanner;

public class ejercicio12 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Introduzca la base imponible: ");
            double baseImponible = scanner.nextDouble();


            System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
            String tipoIva = scanner.next();


            System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            String codigoPromocional = scanner.next();


            double iva = calcularIva(baseImponible, tipoIva);


            double precioConIva = baseImponible + iva;

            double descuento = aplicarDescuento(precioConIva, codigoPromocional);

            double precioFinal = precioConIva - descuento;

            System.out.printf("Base imponible: %.2f\n", baseImponible);
            System.out.printf("IVA (%s): %.2f\n", tipoIva, iva);
            System.out.printf("Precio con IVA: %.2f\n", precioConIva);
            System.out.printf("Cód. promo. (%s): -%.2f\n", codigoPromocional, descuento);
            System.out.printf("TOTAL: %.2f\n", precioFinal);

            scanner.close();
        }

        public static double calcularIva(double baseImponible, String tipoIva) {
            double iva = 0;
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
                    System.out.println("Tipo de IVA no válido.");
                    break;
            }
            return iva;
        }

        public static double aplicarDescuento(double precioConIva, String codigoPromocional) {
            double descuento = 0;
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
                    System.out.println("Código promocional no válido.");
                    break;
            }
            return descuento;
        }
    }
