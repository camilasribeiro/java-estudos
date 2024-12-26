import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoDeDuracao = scanner.nextInt();
        int horas = 0;
        int minutos = 0;

        while (tempoDeDuracao >= 60) {
            minutos += 1;
            tempoDeDuracao -= 60;
        }

        while (minutos > 59) {
            horas += 1;
            minutos -= 60;
        }

        System.out.printf("%d:%d:%d%n", horas, minutos, tempoDeDuracao);

        scanner.close();
    }
}
