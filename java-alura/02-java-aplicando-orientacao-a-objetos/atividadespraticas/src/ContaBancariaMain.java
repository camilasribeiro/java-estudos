public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.printf("Saldo: R$%.2f%n", conta.getSaldo());


        conta.setSaldo(1500);
        System.out.printf("Novo saldo: R$%.2f%n", conta.getSaldo());
    }
}