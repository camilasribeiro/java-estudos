public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("Gol", "ABC-1234", 2026);

        System.out.println("Veículo cadastrado: ");
        System.out.println("Modelo " + meuVeiculo.getModelo());
        System.out.println("Placa " + meuVeiculo.getPlaca());
        System.out.println("Ano " + meuVeiculo.getAno());
    }
}
