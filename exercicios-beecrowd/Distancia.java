import java.util.Scanner;

public class Distancia {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        int minutos = km * 2;

        System.out.printf("%d minutos%n", minutos);

        scanner.close();
    }
}
