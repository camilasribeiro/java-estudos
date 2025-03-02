import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);
    String nomeCliente = "Camila Ribeiro";
    String tipoConta = "Corrente";
    double saldo = 2500.00;
    int escolha = 0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.exibirInformacoes();
        conta.menuOpcoes();
    }

    public void exibirInformacoes() {
        System.out.println("*****************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: R$ %.2f\n", saldo);
        System.out.println("\n*****************************");
    }

    public void receberTransferencia() {
        System.out.println("Informe o valor a receber: ");
        double valorReceber = scanner.nextDouble();
        saldo += valorReceber;
        System.out.println("Transferência recebida.");
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }

    public void fazerTransferencia() {
        System.out.println("Informe o valor que deseja transferir: ");
        double valorTransferir = scanner.nextDouble();
        if (valorTransferir > saldo) {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        } else {
            saldo -= valorTransferir;
            System.out.println("Transferência realizada.");
            System.out.printf("Saldo: R$ %.2f\n", saldo);
        }
    }

    public void menuOpcoes() {
        do {
            System.out.println("\nOperações");
            System.out.println("[1] Consultar saldo");
            System.out.println("[2] Receber valor");
            System.out.println("[3] Transferir valor");
            System.out.println("[4] Sair");

            System.out.println("Digite a opção desejada: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> System.out.printf("Saldo: R$ %.2f\n", saldo);
                case 2 -> receberTransferencia();
                case 3 -> fazerTransferencia();
                case 4 -> System.out.println("Encerrando o programa. Até logo!");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 4);
    }
}
