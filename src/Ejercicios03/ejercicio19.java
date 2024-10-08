package Ejercicios03;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        System.out.print("Introduce el carácter para pintar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        String piramide = crearPiramide(altura, caracter);
        System.out.println(piramide);

        scanner.close();
    }

    public static String crearPiramide(int altura, char caracter) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < altura; i++) {
            for (int j = altura - i; j > 1; j--) {
                resultado.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                resultado.append(caracter).append(" ");
            }
            resultado.append("\n");
        }

        return resultado.toString();
    }
}
