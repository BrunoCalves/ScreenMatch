package br.com.screenmatch.calculos;

public class FiltraRecomendacao {

    public  void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está na aba recomendados!");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Possui uma boa avaliacao!");
        }else{
            System.out.println("Assista depois!");
        }
    }
}
