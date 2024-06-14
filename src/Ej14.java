import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        while (true) {
            // Leer los valores de A y B
            System.out.print("Ingrese el valor de A (debe ser menor que B): ");
            a = scanner.nextInt();
            System.out.print("Ingrese el valor de B (debe ser mayor que A): ");
            b = scanner.nextInt();

            // Verificar que A sea menor que B
            if (a < b) {
                // Mostrar los números pares entre A y B
                System.out.println("Los números pares entre " + a + " y " + b + " son:");
                for (int i = a; i <= b; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;  // Salir del bucle si A < B
            } else {
                // Mostrar mensaje de error si A no es menor que B
                System.out.println("Error: A debe ser menor que B. Por favor, inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}
