import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.printf("O número %d é negativo.", numero);
        } else if (numero > 0){
            System.out.printf("O número %d é positivo.", numero);
        } else {
            System.out.printf("O número %d é neutro.", numero);
        }
    }
}
