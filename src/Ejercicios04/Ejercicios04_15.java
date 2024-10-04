package Ejercicios04;

import java.util.Random;

public class Ejercicios04_15 {
    public static void main(String[] args) {
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
        Random aleatorio = new Random();

        int numeroNotas = generarNumeroNotas(aleatorio);
        System.out.println("Número notas: " + numeroNotas);

        StringBuilder melodia = new StringBuilder();
        String primeraNota = "";

        for (int i = 0; i < numeroNotas; i++) {
            String notaActual = notas[aleatorio.nextInt(notas.length)];
            melodia.append(notaActual);

            if (i == 0) {
                primeraNota = notaActual;
            }

            if ((i + 1) % 4 == 0 && (i + 1) < numeroNotas) {
                melodia.append(" | ");
            } else if (i < numeroNotas - 1){
                melodia.append(" ");
            }
        }

        melodia.append(" ").append(primeraNota);
        System.out.println("Melodia generada: " + melodia.toString());
    }

    private static int generarNumeroNotas(Random aleatorio) {
        int numeroNotas;
        do {
            numeroNotas = 4 + (aleatorio.nextInt(7) * 4);
        } while (numeroNotas < 4 || numeroNotas > 28);
        return numeroNotas;
    }
}
