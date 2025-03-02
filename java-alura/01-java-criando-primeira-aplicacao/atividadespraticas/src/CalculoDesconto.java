public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (precoOriginal / 100) * percentualDesconto;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.printf("Preco original: R$%.2f", precoOriginal);
        System.out.printf("\nDesconto: R$%.2f", valorDesconto);
        System.out.printf("\nPreço com desconto: R$%.2f", novoPreco);
    }
}
