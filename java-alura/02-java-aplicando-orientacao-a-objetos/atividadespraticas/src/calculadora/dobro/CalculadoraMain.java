package calculadora.dobro;

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println("Dobro do número: " + resultado);
    }
}