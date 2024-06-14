import java.util.Scanner;

public class Ej15DoWhileConRespuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        char respuesta;

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo.");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " es negativo.");
            }

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }

            System.out.print("¿Desea introducir más números? (S/N): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta != 'N' && respuesta != 'n');

        scanner.close();
    }
}
