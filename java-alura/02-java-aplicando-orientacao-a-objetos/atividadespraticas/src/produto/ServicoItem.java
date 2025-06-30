package produto;

import calculadora.imposto.Tributavel2;

public class ServicoItem extends Item implements Tributavel2 {

    private int quantidadeHoras;

    public double calculaImposto() {
        return getPreco() * 0.12;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
