import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;
        double raio = scanner.nextDouble();
        double area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);
        scanner.close();
    }
}
