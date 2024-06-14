import java.util.Scanner;

public class Ej10y9 {
    
    public static void main(String[] args) {
        System.out.print("ingrese el valor de a: ");
        Scanner lectura = new Scanner(System.in);
        int ladoA = lectura.nextInt();
        System.out.print("ingrese el valor de b: ");
        int ladoB = lectura.nextInt();
        System.out.print("ingrese el valor de c: ");
        int ladoC = lectura.nextInt();

        if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {
            System.out.println("es un triangulo");
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("equilatero");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("escaleno");
            } else {
                System.out.println("isoceles");
            }
        } else {
            System.out.println("no es un triangulo");
        }
    }
}
