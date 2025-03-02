import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("[1] Calcular área do quadrado");
            System.out.println("[2] Calcular área do círculo");
            System.out.println("[3] Sair");
            System.out.println("Escolha uma opção: ");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.printf("A área do quadrado é %.2f\n", areaQuadrado);
                break;
            } else if (escolha == 2){
                System.out.println("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                System.out.printf("A área do círculo é %.2f\n", areaCirculo);
                break;
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}
