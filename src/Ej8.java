import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        System.out.print("ingrese un caracter: ");
        Scanner lectura = new Scanner(System.in);
        String entrada = lectura.nextLine();
        if (entrada.length() == 1) {
            if (entrada.equals(entrada.toLowerCase())) {
                System.out.print("la entrada es minuscula");
            } else {
                System.out.print("la entrada es mayuscula");
            }
        } else {
            System.out.print("dije un caracter simio");
        }
    }
}
