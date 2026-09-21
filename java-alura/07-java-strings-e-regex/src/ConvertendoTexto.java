import java.util.Scanner;

public class ConvertendoTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        String textoMaiuscula = texto.toUpperCase();
        String textoMinuscula = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + textoMaiuscula);
        System.out.println("Texto em minúsculas: " + textoMinuscula);
        scanner.close();
    }
}
