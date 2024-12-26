import java.util.Scanner;

public class IdadeEmDias {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeEmDias = scanner.nextInt();

        int ano = idadeEmDias / 365;
        idadeEmDias %= 365;

        int mes = idadeEmDias / 30;
        idadeEmDias %= 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(idadeEmDias + " dia(s)");

        scanner.close();
    }
}
