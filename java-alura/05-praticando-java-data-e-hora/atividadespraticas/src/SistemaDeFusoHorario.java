import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaDeFusoHorario {
    public static void main(String[] args) {

        ZonedDateTime fusoHorario = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horário atual em Tóquio: " + formatoHora.format(fusoHorario));
    }
}
