import java.util.Scanner;

public class Esfera {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double raioEsfera = scanner.nextDouble();

        double volume = (4/3.0) * pi * Math.pow(raioEsfera, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }
}
