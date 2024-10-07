import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();

        double notaSegundoExamen = calcularNotaSegundoExamen(notaPrimerExamen, notaDeseada);

        System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");

        scanner.close();
    }

    public static double calcularNotaSegundoExamen(double notaPrimerExamen, double notaDeseada) {
        return (notaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

}
}
