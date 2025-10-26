import java.time.Duration;
import java.time.LocalTime;

public class TempoGastoEmCadaTarefa {
    public static void main(String[] args) {

        LocalTime horarioInicio = LocalTime.of(10, 0);
        LocalTime horarioFim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(horarioInicio, horarioFim);

        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

    }
}
