import java.util.Scanner;

public class ExemploLoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = scanner.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }
        if (totalNotas != 0) {
            System.out.printf("Média de avaliações: %.1f", (mediaAvaliacao / totalNotas));
        }
    }
}
