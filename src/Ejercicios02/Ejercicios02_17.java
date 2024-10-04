package Ejercicios02;

import java.util.Scanner;

public class Ejercicios02_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        //Solicitud de entero
        while (!numeroValido) {
            System.out.println("Introduce un entero: ");

            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                numeroValido = true;
            } else {
                System.out.println("No válido, introduce un entero");
                sc.next();
            }
        }

        int ultimaCifra = Math.abs(numero % 10);
        System.out.println("La última cifra de " + numero + " es: " + ultimaCifra);
        sc.close();
    }
}
