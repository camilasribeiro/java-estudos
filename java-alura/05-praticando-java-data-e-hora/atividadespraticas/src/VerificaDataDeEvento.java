import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificaDataDeEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: " + formatoData.format(dataEvento));
        System.out.println("Data atual: " + formatoData.format(dataAtual));

        if (dataAtual.isBefore(dataEvento)) {
            System.out.println("O evento está por vir.");
        } else {
            System.out.println("O evento já ocorreu.");
        }
    }
}
