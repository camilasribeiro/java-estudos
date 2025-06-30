package calculadora.preco.porcentagem;

public class ProdutoFisico implements Calculavel{
    private double precoBase;

    public ProdutoFisico(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + ((precoBase / 100) * 10);
    }
}
