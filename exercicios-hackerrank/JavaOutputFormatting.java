import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main (String[] ags){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(32));

        for (int i = 0; i < 3; i++) {
            String entradaString = scanner.next();
            int entradaNum = scanner.nextInt();

            System.out.printf("%-15s%03d%n", entradaString, entradaNum);
        }

        System.out.println("=".repeat(32));
        scanner.close();
    }
}