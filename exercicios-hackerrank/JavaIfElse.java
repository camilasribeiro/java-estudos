import java.util.Scanner;

public class JavaIfElse {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            if (numero >= 2 && numero <=5){
                System.out.println("Not Weird");
            } else if (numero >= 6 && numero <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
