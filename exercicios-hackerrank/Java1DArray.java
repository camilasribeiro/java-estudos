import java.util.*;

public class Java1DArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}