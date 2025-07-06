import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        System.out.println(A.length() + B.length());

        System.out.println(A.compareTo(B) > 0? "Yes" : "No");

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalizedA + " " + capitalizedB);
    }
}



