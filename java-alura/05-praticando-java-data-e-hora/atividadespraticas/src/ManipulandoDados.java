import java.time.*;
import java.time.format.DateTimeFormatter;

public class ManipulandoDados {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParceira = LocalDate.of(2025,11, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParceira.plusDays(30);

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParceira);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        if (dataPrimeiraParceira.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento.");
        } else if (dataPrimeiraParceira.isBefore(LocalDate.now())) {
            System.out.println("Parcela já passou do dia do vencimento.");
        } else {
            System.out.println("Ainda não está no dia do vencimento.");
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de conclusão da compra: " + dataConclusaoCompra);

        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data de conclusão da compra NY: " + dataCompraNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());

    }
}
