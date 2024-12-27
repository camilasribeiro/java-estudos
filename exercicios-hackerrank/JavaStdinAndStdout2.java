import java.util.Scanner;

public class JavaStdinAndStdout2 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt = scanner.nextInt();
        double numberDouble = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + numberInt);

        scanner.close();
    }
}
