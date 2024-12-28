import java.util.Scanner;

public class DataTypes {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        int numInt = scanner.nextInt() + i;
        double numDouble = scanner.nextDouble() + d;
        scanner.nextLine();
        String myString = s + scanner.nextLine();

        System.out.println(numInt);
        System.out.println(numDouble);
        System.out.println(myString);

        scanner.close();
    }
}
