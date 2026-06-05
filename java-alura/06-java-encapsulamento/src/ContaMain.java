import java.math.BigDecimal;

public class ContaMain {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(new BigDecimal("1000.00"));
        conta.sacar(new BigDecimal("200"));
        conta.exibirSaldo();
    }
}
