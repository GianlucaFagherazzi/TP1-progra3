import java.util.Scanner;
public class Ej19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder concatenacion = new StringBuilder();

        System.out.println("Ingrese palabras (presione Enter para cada palabra, escriba una cadena vacía para terminar):");

        String palabra = scanner.nextLine().trim();  // Leer la primera palabra
        
        while (!palabra.isEmpty()) {
            concatenacion.append(palabra).append(" ");  // Concatenar la palabra al StringBuilder
            palabra = scanner.nextLine().trim();  // Leer la siguiente palabra
        }

        // Mostrar la concatenación de palabras ingresadas
        System.out.println("La concatenación de las palabras es:");
        System.out.println(concatenacion.toString());

        scanner.close();
    }
}


