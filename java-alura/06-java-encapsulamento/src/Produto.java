import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        if (preco.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Preço inválido.");
            preco = BigDecimal.ZERO;
        }
        this.preco = preco;
    }
}
