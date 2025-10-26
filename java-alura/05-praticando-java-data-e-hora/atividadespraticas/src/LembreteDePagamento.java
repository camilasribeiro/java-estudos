import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembreteDePagamento {
    public static void main(String[] args) {

        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);

        int periodoAntecedencia = 5;
        LocalDate lembreteDataPagamento = dataVencimento.minusDays(periodoAntecedencia);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do lembrete: " + formatoData.format((lembreteDataPagamento)));
    }
}
