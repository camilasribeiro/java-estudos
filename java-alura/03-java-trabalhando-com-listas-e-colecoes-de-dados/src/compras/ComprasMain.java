package compras;

import java.util.Collections;
import java.util.Scanner;

public class ComprasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: R$ ");
        double limite = scanner.nextDouble();

        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra: R$ ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartaoCredito.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        if (!cartaoCredito.getCompras().isEmpty()) {
            System.out.println("\n*********** COMPRAS DO CARTÃO ***********");

            Collections.sort(cartaoCredito.getCompras());
            double total = 0.0;
            for (Compra compra : cartaoCredito.getCompras()) {
                total += compra.getValor();
                System.out.printf("Compra: %-20s | R$ %.2f%n", compra.getDescricao(), compra.getValor());
            }

            System.out.println("*****************************************");
            System.out.printf("%-28s | R$ %.2f%n", "Total:", total);
            System.out.printf("%-28s | R$ %.2f%n", "Saldo do cartão:", cartaoCredito.getSaldo());
            System.out.println("*****************************************\n");

        }
    }
}