package animais;

public class Cachorro extends Animal {
    private String raca;
    private String porte;

    public Cachorro(String nome, String sexo, String raca, String porte) {
        super(nome, sexo);
        this.raca = raca;
        this.porte = porte;
    }

    public String fazSom() {
        return "Au au...";
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" [Raça: %s | Porte: %s]", raca, porte);
    }
}