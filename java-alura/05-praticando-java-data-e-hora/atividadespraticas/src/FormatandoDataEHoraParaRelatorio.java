import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataEHoraParaRelatorio {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: " + formatoData.format(data));
        System.out.println("Hora formatada: " + formatoHora.format(hora));
    }
}
