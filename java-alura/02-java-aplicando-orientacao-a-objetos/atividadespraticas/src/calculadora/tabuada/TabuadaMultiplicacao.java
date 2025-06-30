package calculadora.tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("Tabuada do número " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
