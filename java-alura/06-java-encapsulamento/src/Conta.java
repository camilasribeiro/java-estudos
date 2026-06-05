import java.math.BigDecimal;

public class Conta {
    private String titular;
    private BigDecimal saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = BigDecimal.ZERO;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(valor);
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: R$ %.2f\n", titular, saldo);
    }
}
