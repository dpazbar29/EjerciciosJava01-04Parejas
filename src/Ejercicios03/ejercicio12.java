package Ejercicios03;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String resultado = obtenerFibonacci(n);
        System.out.print(resultado);
        scanner.close();
    }

    public static String obtenerFibonacci(int n) {
        StringBuilder fibonacciSeries = new StringBuilder();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciSeries.append(a).append(" ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        return fibonacciSeries.toString().trim();
    }
}
