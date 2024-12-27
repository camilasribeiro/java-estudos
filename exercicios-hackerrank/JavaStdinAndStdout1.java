import java.util.Scanner;

public class JavaStdinAndStdout1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();

        System.out.printf("%d%n%d%n%d%n", myInt1, myInt2, myInt3);

        scanner.close();
    }
}
