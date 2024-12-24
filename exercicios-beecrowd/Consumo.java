import java.util.Scanner;

public class Consumo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l%n", consumo);

        scanner.close();
    }
}