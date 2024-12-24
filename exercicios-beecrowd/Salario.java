import java.util.Scanner;
public class Salario {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double salarioHora = scanner.nextDouble();

        double salario = horasTrabalhadas * salarioHora;

        System.out.printf("NUMBER = %d%n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();
    }
}
