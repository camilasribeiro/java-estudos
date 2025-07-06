import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = Integer.parseInt(scanner.nextLine());
        while (numberOfTests-- > 0) {
            String regexInput = scanner.nextLine();
            try {
                Pattern compiledPattern = Pattern.compile(regexInput);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}