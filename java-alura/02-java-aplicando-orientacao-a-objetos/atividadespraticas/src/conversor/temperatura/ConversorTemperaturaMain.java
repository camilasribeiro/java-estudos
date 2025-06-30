package conversor.temperatura;

public class ConversorTemperaturaMain {

    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        double celsius = 37.0;
        double fahrenheit = 98.6;

        System.out.printf("Conversão de %.1f Celsius para Fahrenheit: %.1f", celsius, conversor.celsiusParaFahrenheit(celsius));
        System.out.printf("\nConversão de %.1f Fahrenheit para Celsius: %.1f", fahrenheit, conversor.fahrenheitParaCelsius(fahrenheit));
    }
}
