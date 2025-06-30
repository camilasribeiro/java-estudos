package produto;

import calculadora.imposto.Tributavel;

public class ProdutoTributavel implements Tributavel {
    private String name;
    private double valor;

    @Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
