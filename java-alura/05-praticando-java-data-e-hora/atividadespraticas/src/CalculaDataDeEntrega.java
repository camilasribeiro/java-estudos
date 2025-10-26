import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaDataDeEntrega {
    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.of(2025, 03, 15);
        LocalDate dataFim = dataInicio.plusDays(15);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de entrega: " + formatoData.format(dataFim));
    }
}
