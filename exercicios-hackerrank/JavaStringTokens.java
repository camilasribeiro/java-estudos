import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] palavras = s.trim().split("[^a-zA-Z]+");

        if (s.trim().isEmpty() || palavras.length == 0 || palavras[0].equals("")){
            System.out.println(0);
        } else {
            System.out.println(palavras.length);

            for (String palavra : palavras) {
                System.out.println(palavra);
            }
        }

        scanner.close();
    }
}