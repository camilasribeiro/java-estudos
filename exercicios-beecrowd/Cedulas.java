import java.util.Scanner;

public class Cedulas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        System.out.println(valor);

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        while (valor >= 100) {
            valor -= 100;
            nota100 += 1;
        }

        while (valor >= 50) {
            valor -= 50;
            nota50 += 1;
        }

        while (valor >= 20) {
            valor -= 20;
            nota20 += 1;
        }

        while (valor >= 10) {
            valor -= 10;
            nota10 += 1;
        }

        while (valor >= 5) {
            valor -= 5;
            nota5 += 1;
        }

        while (valor >= 2) {
            valor -= 2;
            nota2 += 1;
        }

        while (valor == 1) {
            valor -= 1;
            nota1 += 1;
        }

        System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00%n", nota1);

    }
}
