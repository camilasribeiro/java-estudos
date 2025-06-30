package calculadora.preco.total;

public class PrecoTotalMain {

    public static void main(String[] args) {

        Produto produto = new Produto("Celular", 2540.90);
        produto.aplicarDesconto(10);
        double totalProduto = produto.calcularPrecoTotal(2);
        System.out.printf("Produto: %s - Total para 2 unidades com desconto: R$ %.2f", produto.getNome(), totalProduto);


        Servico servico = new Servico("Reparo de celular", 105.00);
        servico.aplicarDesconto(15);
        double totalServico = servico.calcularPrecoTotal(5);
        System.out.printf("\nServiço: %s = Total para 5 horas com desconto: R$ %.2f", servico.getDescricao(), totalServico);

    }
}
