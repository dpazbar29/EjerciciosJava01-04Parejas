import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base (número real): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        String resultado = calcularPotencias(base, exponente);
        System.out.println(resultado);

        scanner.close();
    }

    public static String calcularPotencias(double base, int exponente) {
        StringBuilder potencias = new StringBuilder();

        for (int i = 1; i <= exponente; i++) {
            double potencia = 1;
            for (int j = 0; j < i; j++) {
                potencia *= base;
            }
            potencias.append(base).append(" ^ ").append(i).append(" = ").append(potencia).append("\n");
        }

        return potencias.toString().trim();
    }
}
