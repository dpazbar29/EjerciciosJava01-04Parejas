package Ejercicios03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        System.out.print("Introduce el carácter para pintar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        List<String> piramide = crearPiramide(altura, caracter);
        for (String linea : piramide) {
            System.out.println(linea);
        }

        scanner.close();
    }

    public static List<String> crearPiramide(int altura, char caracter) {
        List<String> resultado = new ArrayList<>();

        for (int i = 0; i < altura; i++) {
            StringBuilder linea = new StringBuilder();

            for (int j = altura - i; j > 1; j--) {
                linea.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                linea.append(caracter).append(" ");
            }

            resultado.add(linea.toString().trim());
        }

        return resultado;
    }
}
