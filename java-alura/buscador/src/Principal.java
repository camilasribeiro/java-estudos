import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um CEP para consulta: ");
        var cep = scanner.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.salvarArquivoJson(novoEndereco);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
