package Ejercicios03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base (número real): ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        List<Double> resultado = calcularPotencias(base, exponente);
        for (Double linea : resultado) {
            System.out.println(linea);
        }

        scanner.close();
    }

    public static List<Double> calcularPotencias(double base, int exponente) {
        List<Double> potencias = new ArrayList<>();

        for (int i = 1; i <= exponente; i++) {
            double potencia = 1;
            for (int j = 0; j < i; j++) {
                potencia *= base;
            }
            potencias.add(potencia);
        }

        return potencias;
    }
}
