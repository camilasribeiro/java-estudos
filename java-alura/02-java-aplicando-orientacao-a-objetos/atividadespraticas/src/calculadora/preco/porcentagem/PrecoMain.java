package calculadora.preco.porcentagem;

public class PrecoMain {

    public static void main(String[] args) {

        Livro livro = new Livro(43.50);
        System.out.printf("Valor do livro: R$ %.2f", livro.calcularPrecoFinal());

        ProdutoFisico produtoFisico = new ProdutoFisico(43.50);
        System.out.printf("\nValor do produto físico: R$ %.2f", produtoFisico.calcularPrecoFinal());
    }
}
