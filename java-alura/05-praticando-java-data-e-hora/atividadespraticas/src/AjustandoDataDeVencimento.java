import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoDataDeVencimento {
    public static void main(String[] args) {

        LocalDate dataVencimentoAtual = LocalDate.of(2025, 03, 20);
        LocalDate novaDataVencimento = dataVencimentoAtual.plusMonths(1);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = formatoData.format(novaDataVencimento);

        System.out.println("Nova data de vencimento: " + dataFormatada);
    }
}
