import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger sumResult = bigA.add(bigB);
        BigInteger multiplicationResult = bigA.multiply(bigB);

        System.out.println(sumResult);
        System.out.println(multiplicationResult);
    }
}