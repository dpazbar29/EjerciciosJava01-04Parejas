package Ejercicios02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;

        // Definir la ruta relativa del archivo de preguntas
        String rutaArchivo = "src/test_infidelidad.txt";

        // Listas para almacenar preguntas y conclusiones
        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String[]> conclusiones = new ArrayList<>();

        // Cargar preguntas y conclusiones desde el archivo
        if (!cargarPreguntasYConclusiones(rutaArchivo, preguntas, conclusiones)) {
            System.out.println("Error al cargar el archivo. Programa finalizado.");
            return;
        }

        System.out.println("Responde a cada pregunta con verdadero o falso:\n");

        // Procesar las preguntas
        for (String pregunta : preguntas) {
            System.out.println(pregunta);
            System.out.print("Respuesta (verdadero/falso): ");
            String respuesta = sc.nextLine().trim().toLowerCase();

            // Validar que la respuesta sea "verdadero" o "falso"
            while (!respuesta.equals("verdadero") && !respuesta.equals("falso")) {
                System.out.println("Respuesta no válida. Por favor, introduce 'verdadero' o 'falso'.");
                System.out.print("Respuesta (verdadero/falso): ");
                respuesta = sc.nextLine().trim().toLowerCase();
            }

            // Sumar puntos si la respuesta es "verdadero"
            if (respuesta.equals("verdadero")) {
                puntos += 3;
            }
        }

        // Mostrar la conclusión final según los puntos obtenidos
        mostrarConclusiones(puntos, conclusiones);
        sc.close();
    }

    // Método para cargar preguntas y conclusiones desde el archivo utilizando FileReader
    public static boolean cargarPreguntasYConclusiones(String archivoNombre, ArrayList<String> preguntas, ArrayList<String[]> conclusiones) {
        try (BufferedReader lectorArchivo = new BufferedReader(new FileReader(archivoNombre))) {
            String linea;
            boolean leyendoPreguntas = true;

            while ((linea = lectorArchivo.readLine()) != null) {
                linea = linea.trim();

                if (linea.equalsIgnoreCase("Conclusiones:")) {
                    leyendoPreguntas = false;
                    continue;
                }

                // Leer preguntas
                if (leyendoPreguntas && linea.matches("^\\d+\\.\\s+.*")) {
                    preguntas.add(linea);
                }

                // Leer conclusiones
                if (!leyendoPreguntas && linea.contains("-")) {
                    String[] partes = linea.split(":");
                    String[] rangoYConclusion = {partes[0].trim(), partes[1].trim()};
                    conclusiones.add(rangoYConclusion);
                }
            }

            return true;

        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo '" + archivoNombre + "'.");
            e.printStackTrace();
            return false;
        }
    }

    // Método para mostrar las conclusiones basadas en los puntos obtenidos
    public static void mostrarConclusiones(int puntos, ArrayList<String[]> conclusiones) {
        for (String[] conclusion : conclusiones) {
            String[] rango = conclusion[0].split("-");
            int min = Integer.parseInt(rango[0].trim());
            int max = Integer.parseInt(rango[1].trim());

            if (puntos >= min && puntos <= max) {
                System.out.println("\nResultado del test: " + conclusion[1]);
                return;
            }
        }
    }
}
