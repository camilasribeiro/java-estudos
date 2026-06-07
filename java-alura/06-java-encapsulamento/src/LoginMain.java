import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Usuario aluno = new Usuario("aluno2025", "escola@123");

        Scanner scanner = new Scanner(System.in);
        int tentativasRestante = 3;

        while (tentativasRestante > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestante--;
                if (tentativasRestante == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador");
                } else {
                    System.out.println("Senha incorreta. Tentativas restante: " + tentativasRestante);
                }
            }
        }
        scanner.close();
    }
}
