import java.util.Scanner;
public class Ej17y18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor del día
        System.out.print("Ingrese un número de día (1-7): ");
        int day = scanner.nextInt();

        // Usar la declaración switch para determinar el nombre del día
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día inválido. Por favor ingrese un número entre 1 y 7.");
        }

        // Usar otra declaración switch para determinar si es laborable o fin de semana
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un día laborable.");
                break;
            case 6:
            case 7:
                System.out.println("Es un día de fin de semana.");
                break;
        }

        scanner.close();
    }
}

