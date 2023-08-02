import br.com.screenmatch.app.Episodios;
import br.com.screenmatch.app.Filme;
import br.com.screenmatch.app.Serie;
import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltraRecomendacao;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Harry Potter");
        filme.setAnoLancamento(2001);
        filme.setDuracaoEmMinutos(180);
        filme.avalia(10);
        filme.avalia(3);
        filme.avalia(5);

        filme.exibeFicha();

        Serie serie = new Serie();
        serie.setNome("The last of us");
        serie.setAnoLancamento(2022);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setTempoPorEpisodio(70);
        serie.avalia(10);
        serie.avalia(5);
        serie.avalia(5);
        serie.exibeFicha();

        Episodios ep = new Episodios();
        ep.setNumeroEpisodio(1);
        ep.setSerie(serie);
        ep.setTotalVisualzacao(300);

        Filme filme2 = new Filme();
        filme2.setNome("Harry Potter 2");
        filme2.setAnoLancamento(2002);
        filme2.setDuracaoEmMinutos(200);
        filme2.avalia(10);
        filme2.avalia(10);
        filme2.avalia(10);



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);

        FiltraRecomendacao filtro = new FiltraRecomendacao();

        filtro.filtra(ep);


        System.out.println(calculadora.getTempoTotal());

    }
}