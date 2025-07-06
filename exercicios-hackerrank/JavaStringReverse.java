import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(A);
        String reverso = stringBuilder.reverse().toString();

        if (A.equals(reverso)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}