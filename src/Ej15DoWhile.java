import java.util.Scanner;

public class Ej15DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros (0 para finalizar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero > 0) {
                    System.out.println("El número " + numero + " es positivo.");
                } else {
                    System.out.println("El número " + numero + " es negativo.");
                }

                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es par.");
                } else {
                    System.out.println("El número " + numero + " es impar.");
                }
            }
        } while (numero != 0);

        scanner.close();
    }
}

