import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.printf("%s tem %d anos e vai investir R$%.2f por mês.", nome, idade, valor);

        scanner.close();
    }
}
