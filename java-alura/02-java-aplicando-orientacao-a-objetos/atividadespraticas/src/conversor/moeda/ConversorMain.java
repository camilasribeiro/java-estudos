package conversor.moeda;

public class ConversorMain {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double resultado = conversor.converterDolarParaReal(10);
        System.out.printf("Conversão realizada: R$ %.2f", resultado);
    }
}
