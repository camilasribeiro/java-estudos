package produtos;

import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Blusa", 250.00, 1);
        Produto produto2 = new Produto("Calça", 220.00, 2);
        Produto produto3 = new Produto("Tênis", 350.00, 1);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaProdutos.size());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Leite", 3.50, 5, "20/09/2025");
        ProdutoPerecivel produtoPerecivel2 = new ProdutoPerecivel("Carne", 35.00, 1, "22/07/2025");
        ProdutoPerecivel produtoPerecivel3 = new ProdutoPerecivel("Ovo", 10.00, 2, "15/08/2025");

        ArrayList<ProdutoPerecivel> listaProdutosPereciveis = new ArrayList<>();
        listaProdutosPereciveis.add(produtoPerecivel1);
        listaProdutosPereciveis.add(produtoPerecivel2);
        listaProdutosPereciveis.add(produtoPerecivel3);

        System.out.println("Tamanho da lista de produtos perecíveis: " + listaProdutosPereciveis.size());

        for (Produto produtoPerecivel : listaProdutosPereciveis) {
            System.out.println(produtoPerecivel);
        }
    }
}