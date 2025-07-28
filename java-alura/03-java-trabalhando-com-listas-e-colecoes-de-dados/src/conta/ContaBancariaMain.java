package conta;

import java.util.ArrayList;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(101, 1000.00);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.50);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.00);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);

        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.printf("Conta com o maior saldo - Número %d\nSaldo R$ %.2f", contaMaiorSaldo.getNumeroConta(), contaMaiorSaldo.getSaldo());
    }
}
