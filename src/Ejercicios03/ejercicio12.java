package Ejercicios03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();
        List<Integer> resultado = obtenerFibonacci(n);
        for (int num : resultado) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static List<Integer> obtenerFibonacci(int n) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciSeries.add(a);
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        return fibonacciSeries;
    }
}
