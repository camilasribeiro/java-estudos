package calculadora.geometrica;

public class CalculadoraGeometricaMain {

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular(5, 8);

        double calculoDaAreaDaSala = calculadoraSalaRetangular.calcularArea();
        double calculoDoPerimetroDaSala = calculadoraSalaRetangular.calcularPerimetro();

        System.out.printf("A área da sala é %.2f", calculoDaAreaDaSala);
        System.out.printf("\nO perímetro da sala é %.2f", calculoDoPerimetroDaSala);
    }
}
