import java.util.Scanner;

public class JavaLoops2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int i = 1; i <= queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int soma = a;

            for (int j = 0; j < n; j++) {
                soma += b * (int) Math.pow(2, j);
                System.out.print(soma + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}