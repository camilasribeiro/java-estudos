package calculadora.imposto;

public class CalculadoraImposto2 {

    private double totalImposto = 0;

    public void calculaImposto(Tributavel2 tributavel) {
        totalImposto += tributavel.calculaImposto();
    }
}
