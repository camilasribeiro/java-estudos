package animal;

public class Animal {
    private String nome;
    private double peso;

    public void fazerBarulho() {
        System.out.println("Fazendo barulho!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
