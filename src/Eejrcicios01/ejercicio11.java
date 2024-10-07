import java.util.Scanner;

public class ejercicio11 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la cantidad en Kb: ");
            double kilobytes = scanner.nextDouble();
            double megabytes = convertirKbAMb(kilobytes);
            System.out.printf("%.2f Kb son %.2f Mb\n", kilobytes, megabytes);
            scanner.close();
        }

        public static double convertirKbAMb(double kilobytes) {
            return kilobytes / 1024;
        }
}


