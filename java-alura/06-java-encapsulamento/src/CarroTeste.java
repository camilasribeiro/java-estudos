public class CarroTeste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Gol", "ABC-1234", 2026);

        System.out.println("Veículo cadastrado: ");
        System.out.println("Modelo " + meuCarro.getModelo());
        System.out.println("Placa " + meuCarro.getPlaca());
        System.out.println("Ano " + meuCarro.getAno());
    }
}
