import java.io.*;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger number = new BigInteger(n);
        boolean result = number.isProbablePrime(10);

        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}