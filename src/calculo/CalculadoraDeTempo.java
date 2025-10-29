package calculo;

import models.Filme;
import models.Serie;
import models.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
