package br.com.screenmatch.app;

public class Titulo {
    String nome;
    int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }
    public String getNome(){
        return nome;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public void exibeFicha(){
        String ficha = """
                Nome - %s
                Ano de lançamento - %s
                Duração em minutos: %s
                Avaliação - %s
                Total de avaliações - %s
                """.formatted(nome, anoLancamento, getDuracaoEmMinutos(), mediaAvaliacao(), getTotalDeAvaliacoes());

        System.out.println(ficha);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double mediaAvaliacao(){
        double media;
        media = getSomaDasAvaliacoes() / getTotalDeAvaliacoes();

        return media;
    }
}
