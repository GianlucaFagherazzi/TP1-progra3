import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número ingresado por el usuario
        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        // Calcular el factorial utilizando la sentencia for
        long factorial = 1;  // Usamos long para manejar números grandes
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es " + factorial);
        
        scanner.close();
    }
}