package produto;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000.00);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.printf("Preço: R$%.2f%n", produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.printf("Novo preço após desconto: R$%.2f%n", produto.getPreco());
    }
}
