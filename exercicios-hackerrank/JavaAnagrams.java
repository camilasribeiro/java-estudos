import java.util.Scanner;
import java.util.Arrays;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        String aOrdenado = new String(charsA);
        String bOrdenado = new String(charsB);

        return aOrdenado.equalsIgnoreCase(bOrdenado);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
