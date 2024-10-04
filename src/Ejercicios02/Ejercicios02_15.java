package Ejercicios02;

import java.util.Scanner;

public class Ejercicios02_15 {

    public class Piramide {

        public static void piramideArriba(char c, int altura) {
            for (int i = 0; i < altura; i++) {
                // Espacios en blanco
                for (int j = 0; j < altura - i - 1; j++) {
                    System.out.print(" ");
                }
                // Caracteres
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

        public static void piramideAbajo(char c, int altura) {
            for (int i = altura; i > 0; i--) {
                // Espacios en blanco
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }
                // Caracteres
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

        public static void piramideDerecha(char c, int altura) {
            // Parte superior de la pirámide
            for (int i = 1; i <= altura; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
            // Parte inferior de la pirámide
            for (int i = altura - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

        public static void piramideIzquierda(char c, int altura) {
            // Parte superior de la pirámide
            for (int i = 1; i <= altura; i++) {
                // Espacios en blanco
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }
                // Caracteres
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
            // Parte inferior de la pirámide
            for (int i = altura - 1; i > 0; i--) {
                // Espacios en blanco
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }
                // Caracteres
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el carácter para la pirámide: ");
        char caracter = sc.next().charAt(0);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.println("\nElige la dirección de la pirámide:");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la izquierda");
        System.out.println("4. Vértice hacia la derecha");

        int opcion = 0;
        boolean opcionValida = false;

        // Comprobar que la opción es un número y está entre 1 y 4
        while (!opcionValida) {
            System.out.print("\nIntroduce una opción (1-4): ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion >= 1 && opcion <= 4) {
                    opcionValida = true;
                } else {
                    System.out.println("Opción fuera de rango. Debe ser un número entre 1 y 4.");
                }
            } else {
                System.out.println("Entrada no válida. Debe ser un número.");
                sc.next();
            }
        }
        switch(opcion) {
            case 1:
                Piramide.piramideArriba(caracter, altura);
                break;
            case 2:
                Piramide.piramideAbajo(caracter, altura);
                break;
            case 3:
                Piramide.piramideIzquierda(caracter, altura);
                break;
            case 4:
                Piramide.piramideDerecha(caracter, altura);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
