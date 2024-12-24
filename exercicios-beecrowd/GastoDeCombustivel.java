import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        double quantidadeLitros = (double) (tempoGasto * velocidadeMedia) / 12;

        System.out.printf("%.3f%n", quantidadeLitros);

        scanner.close();
    }
}
