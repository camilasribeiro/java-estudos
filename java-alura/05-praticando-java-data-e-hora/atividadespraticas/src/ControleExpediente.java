import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime horarioEntrada = LocalTime.parse(scanner.next(), formatoHora);

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHorariaDiaria = scanner.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime horarioSaida = LocalTime.parse(scanner.next(), formatoHora);

        scanner.close();

        LocalTime horarioSaidaPrevisto = horarioEntrada.plusHours(cargaHorariaDiaria);
        Duration expedientePrevisto = Duration.ofHours(cargaHorariaDiaria);
        Duration horasTrabalhadas = Duration.between(horarioEntrada, horarioSaida);
        Duration saldoHoras = horasTrabalhadas.minus(expedientePrevisto);
        long horasExtras = saldoHoras.toHours();
        long minutosExtras = saldoHoras.toMinutesPart();

        System.out.println("Horário de entrada: " + horarioEntrada.format(formatoHora));
        System.out.println("Horário de saída previsto: " + horarioSaidaPrevisto.format(formatoHora));
        System.out.println("Horário de real de saída: " + horarioSaida.format(formatoHora));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal = saldoHoras.isNegative() ? "-" : "+";
            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}
