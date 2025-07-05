import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String input = scanner.nextLine();

            try {
                long valor = Long.parseLong(input);
                System.out.println(valor + " can be fitted in:");

                if (valor >= Byte.MIN_VALUE && valor <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (valor >= Short.MIN_VALUE && valor <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (valor >= Integer.MIN_VALUE && valor <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (valor >= Long.MIN_VALUE && valor <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
