package br.com.screenmatch.app;
import br.com.screenmatch.calculos.Classificavel;


public class Episodios implements Classificavel {
    private int numeroEpisodio;
    private String nome;
    private Serie serie;

    private int totalVisualzacao;


    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualzacao() {
        return totalVisualzacao;
    }

    public void setTotalVisualzacao(int totalVisualzacao) {
        this.totalVisualzacao = totalVisualzacao;
    }

    @Override
    public int getClassificacao() {
        if(getTotalVisualzacao() >= 100){
            return 4;
        }else{
            return 2;
        }
    }
}
