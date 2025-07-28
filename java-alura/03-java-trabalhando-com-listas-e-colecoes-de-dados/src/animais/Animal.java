package animais;

public class Animal {
    private String nome;
    private String sexo;

    public Animal(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return String.format("[Nome: %s | Sexo: %s]", nome, sexo);
    }
}