public class PrecoProduto {
    public static void main(String[] args) {
        double precoProduto = 11.50;
        int quantidade = 5;

        double total = precoProduto * quantidade;

        System.out.printf("Você comprou %d produtos que custam R$ %.2f. Total a pagar: R$%.2f.", quantidade,
                precoProduto, total);
    }
}
