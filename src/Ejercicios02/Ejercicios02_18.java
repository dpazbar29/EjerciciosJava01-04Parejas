package Ejercicios02;

import java.util.Scanner;

public class Ejercicios02_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        while (!numeroValido) {
            System.out.println("Introduce un entero de como máximo 5 cifras");

            if (sc.hasNextInt()) {
                numero = sc.nextInt();

                // Comprobar que el número esté dentro del rango permitido
                if (numero >= -99999 && numero <= 99999) {
                    numeroValido = true;
                } else {
                    System.out.println("El número debe tener como mucho 5 cifras. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                sc.next();
            }
        }

        int primeraCifra = Math.abs(numero);

        while (primeraCifra >= 10) {
            primeraCifra /= 10;
        }

        System.out.println("La primera cifra de " + numero + " es: " + primeraCifra);

        sc.close();
    }
}
