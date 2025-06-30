package produto;

import calculadora.imposto.Tributavel2;

public class ProdutoItem  extends Item implements Tributavel2 {

    private double peso;

    public double calculaImposto() {
        return getPreco() * 0.1;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
