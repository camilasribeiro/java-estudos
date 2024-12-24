import java.util.Scanner;

public class CalculoSimples {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int numeroPeca1 = scanner.nextInt();
        double valorUnitario1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numeroPeca2 = scanner.nextInt();
        double valorUnitario2 = scanner.nextDouble();

        double calculo = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,calculo);

        scanner.close();
    }
}
