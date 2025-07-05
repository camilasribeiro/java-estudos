import java.util.Scanner;

public class Operators {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mealCost = scanner.nextDouble();
        int tipPercent = scanner.nextInt();
        int taxPercent = scanner.nextInt();

        double tip = mealCost * ((double) tipPercent / 100);
        double tax = mealCost * ((double) taxPercent / 100);
        double totalCost = mealCost + tip + tax;

        System.out.println((int) Math.round(totalCost));
    }
}
