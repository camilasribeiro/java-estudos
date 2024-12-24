import java.util.Scanner;
public class SalarioComBonus {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double total = (totalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();
    }
}
