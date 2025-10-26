import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConversaoFusoHorario {
    public static void main(String[] args) {
        LocalTime horarioAtual = LocalTime.now();
        ZonedDateTime horarioSydney = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + formatoHora.format(horarioAtual));
        System.out.println("Horário atual em Sydney: " + formatoHora.format(horarioSydney));
    }
}
