import java.util.Scanner;
import java.text.DecimalFormat;

public class Ej16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double millas;
        final double MILLA_A_KM = 1.6093;

        do {
            // Leer el valor de millas
            System.out.print("Ingrese la cantidad de millas (0 para finalizar): ");
            millas = scanner.nextDouble();

            if (millas != 0) {
                // Convertir millas a kilómetros
                double kilometros = millas * MILLA_A_KM;
                // Mostrar el resultado con dos decimales
                System.out.println("El equivalente a " + millas + " millas son " + df.format(kilometros) + " kilómetros.");
            }
        } while (millas != 0);

        scanner.close();
    }
}

