import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        System.out.print("ingrese un numero: ");
        Scanner lectura = new Scanner(System.in);
        int numero = lectura.nextInt();
        if (numero % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
    }
}
