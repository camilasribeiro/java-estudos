package aluno;

public class Aluno2Main {
    public static void main(String[] args) {
        Aluno2 aluno1 = new Aluno2("Luiz", 7.5, 8.8, 9.2);
        Aluno2 aluno2 = new Aluno2("Marcos", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.printf("Média: %.2f", aluno1.calcularMedia());
        System.out.println();

        System.out.println("\nAluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.printf("Média: %.2f", aluno2.calcularMedia());
        System.out.println();
    }
}
