package calculadora.preco.porcentagem;

public class Livro implements Calculavel{
    private double precoBase;

    public Livro(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase - ((precoBase / 100) * 10);
    }
}
