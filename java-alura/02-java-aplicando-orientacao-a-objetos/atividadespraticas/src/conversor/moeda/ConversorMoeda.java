package conversor.moeda;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorDolar) {
        double taxaCambio = 5.51;
        return valorDolar * taxaCambio;
    }
}
