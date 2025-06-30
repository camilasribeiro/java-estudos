package musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numeroAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliarMusica(double nota){
        somaDasAvaliacoes += nota;
        numeroAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / numeroAvaliacoes;
    }
}
