package musica;

public class MusicaMain {
    public static void main(String[] args) {
        Musica musicaFavorita = new Musica();

        musicaFavorita.titulo = "Who you are";
        musicaFavorita.artista = "Jessie J";
        musicaFavorita.anoLancamento = 2011;

        musicaFavorita.exibirFichaTecnica();

        musicaFavorita.avaliarMusica(8);
        musicaFavorita.avaliarMusica(9);
        musicaFavorita.avaliarMusica(5);

        double mediaAvaliacoes = musicaFavorita.pegaMedia();
        System.out.printf("Média das avaliações: %.1f", mediaAvaliacoes);
    }
}