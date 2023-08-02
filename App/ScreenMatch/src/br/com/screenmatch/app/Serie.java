package br.com.screenmatch.app;
import br.com.screenmatch.calculos.Classificavel;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int tempoPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTempoPorEpisodio() {
        return tempoPorEpisodio;
    }

    public void setTempoPorEpisodio(int tempoPorEpisodio) {
        this.tempoPorEpisodio = tempoPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * tempoPorEpisodio;
    }
}
