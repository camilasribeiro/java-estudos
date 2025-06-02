public class CarroMain {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Honda Civic";
        meuCarro.ano = 2022;
        meuCarro.cor = "Prata";

        meuCarro.exibirFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calcularIdadeCarro());
    }
}