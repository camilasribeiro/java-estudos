import java.math.BigDecimal;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.setNome("Mouse");
        novoProduto.setPreco(new BigDecimal("-59.90"));

        System.out.println("Produto: " + novoProduto.getNome());
        System.out.println("Preço: " + novoProduto.getPreco());
    }
}
