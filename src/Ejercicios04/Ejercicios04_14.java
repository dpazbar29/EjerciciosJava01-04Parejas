package Ejercicios04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios04_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int intentos = 5;
        int min = 0;
        int max = 100;
        int numeroAdivinado;
        String respuesta;

        System.out.println("Piensa en un número entre " + min + " y " + max + " incluyendolos.");
        System.out.println("Voy a intentar adivinarlo en " + intentos + " oportunidades.");

        // Bucle para adivinar el número
        for (int i = 0; i < intentos; i++) {
            numeroAdivinado = rand.nextInt(max - min + 1) + min;
            System.out.println("¿Es " + numeroAdivinado + "?");

            while (true) {
                System.out.print("Escribe 'mayor', 'menor' o 'correcto': ");
                respuesta = sc.nextLine().trim().toLowerCase();

                if (respuesta.equals("correcto")) {
                    System.out.println("¡He adivinado tu número! Era " + numeroAdivinado + ".");
                    return;
                } else if (respuesta.equals("menor")) {
                    max = numeroAdivinado - 1;
                    break;
                } else if (respuesta.equals("mayor")) {
                    min = numeroAdivinado + 1;
                    break;
                } else {
                    System.out.println("Respuesta no válida. Por favor, responde con 'mayor', 'menor' o 'correcto'.");
                }
            }

            System.out.println("Te quedan " + (intentos - i - 1) + " intentos.");
        }

        System.out.println("¡No he podido adivinar tu número en " + intentos + " intentos!");

        sc.close();
    }
}
